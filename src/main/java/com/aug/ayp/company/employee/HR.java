package com.aug.ayp.company.employee;

import com.aug.ayp.company.calculator.HRWageCalculator;

/**
 * Created by Rawin on 20-Jul-16.
 */
public class HR extends Employee {
    public HR(String name, int workRate) {

        super(name, workRate, new HRWageCalculator());
    }
}
