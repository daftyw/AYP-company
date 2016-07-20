package com.aug.ayp.company.employee;

import com.aug.ayp.company.calculator.RichWageCalculator;

/**
 * Created by Rawin on 20-Jul-16.
 */
public class Programmer extends Employee {
    public Programmer(String name) {
        super(name, 500, new RichWageCalculator());
    }
}
