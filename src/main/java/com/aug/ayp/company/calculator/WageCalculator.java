package com.aug.ayp.company.calculator;

/**
 * Created by Rawin on 20-Jul-16.
 */
public class WageCalculator {

    public float wage(int workHours, int workRate) {
        return workHours * workRate;
    }

    public float overtimeWage(int overTimeHours, int workRate) {
        return overTimeHours * workRate * 3;
    }

    public float totalWage(int workHours, int overTimeHours, int workRate) {
        return overtimeWage(overTimeHours, workRate) + wage(workHours, workRate);
    }

    public float totalWageAfterTax(int workHours, int overTimeHours, int workRate) {
        return totalWage(workHours, overTimeHours, workRate)
                - tax(workHours, overTimeHours, workRate);
    }

    public float tax(int workHours, int overTimeHours, int workRate) {
        return totalWage(workHours, overTimeHours, workRate) * 0.07f;
    }

}
