package com.aug.ayp.company.employee;

import com.aug.ayp.company.calculator.WageCalculator;

/**
 * Created by Rawin on 20-Jul-16.
 */
public abstract class Employee {

    int overTimeHours;
    int workHours;
    boolean working;
    int hourStart;
    int minStart;
    String name;
    int workRate; // per hours
    WageCalculator wageCalculator;

    public Employee(String name, int workRate) {
        overTimeHours = 0;
        workHours = 0;
        working = false;
        this.workRate = workRate;
        this.name = name;
    }

    public Employee(String name, int workRate, WageCalculator wageCalculator) {
        this(name, workRate);
        this.wageCalculator = wageCalculator;
    }

    public void clockIn( int hour, int min ) {
        if(working) {
            System.out.println("Can not clock in now");
            return;
        }
        working = true;

        hourStart = hour;
        minStart = min;
    }

    public void clockOut( int hour, int min ) {
        if(!working) {
            System.out.println("Can not clock out now");
            return;
        }
        working = false;

        // 9 10    19 5
        // 9 0     19 10
        workHours = hour-hourStart;
        if( minStart > min ) {
            workHours-- ;
        }
        if (workHours > 8) {
            overTimeHours = workHours - 8;
            workHours = 8;
        }
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public boolean isWorking() {
        return working;
    }

    public int getHourStart() {
        return hourStart;
    }

    public int getMinStart() {
        return minStart;
    }

    public int getWorkRate() {
        return workRate;
    }

    public void printDetail(WageCalculator wageCalculator) {
        System.out.println("Name: " + name);
        System.out.println("Work hours = " + this.getWorkHours());
        System.out.println("OT Work hours = " + this.getOverTimeHours());
        System.out.println("Wage = " + wageCalculator.wage(workHours, workRate));
        System.out.println("Wage Over time = " + wageCalculator.overtimeWage(overTimeHours, workRate));
        System.out.println("Total wage w/o tax = " + wageCalculator.totalWage(workHours, overTimeHours, workRate));
        System.out.println("Total wage w/ tax = " + wageCalculator.totalWageAfterTax(workHours, overTimeHours, workRate));
        System.out.println();
    }

    public void printDetail() {
        printDetail(wageCalculator);
    }
}
