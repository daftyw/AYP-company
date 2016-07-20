package com.aug.ayp.company;

import com.aug.ayp.company.calculator.RichWageCalculator;
import com.aug.ayp.company.calculator.WageCalculator;
import com.aug.ayp.company.employee.Employee;
import com.aug.ayp.company.employee.Financial;
import com.aug.ayp.company.employee.Programmer;

/**
 * Created by Rawin on 20-Jul-16.
 */
public class Runner {

    public static void main(String [] args) {
        WageCalculator wageCalculator = new RichWageCalculator();

        Employee noble = new Financial("Noble");
        noble.clockIn(9, 20);
        noble.clockOut(20, 0);
        noble.printDetail();

        Employee ble = new Programmer("Ble kung");
        ble.clockIn(5, 20);
        ble.clockOut(23, 0);
        ble.printDetail();
    }
}
