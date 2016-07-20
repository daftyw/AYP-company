package com.aug.ayp.company.calculator;

/**
 * Created by Rawin on 20-Jul-16.
 */
public class RichWageCalculator extends WageCalculator {
    @Override
    public float overtimeWage(int overTimeHours, int workRate) {
        return overTimeHours * workRate * 10;
    }
}
