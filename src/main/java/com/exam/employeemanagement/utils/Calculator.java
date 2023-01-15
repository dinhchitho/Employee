package com.exam.employeemanagement.utils;

import java.math.BigDecimal;

public class Calculator {
    public static double mul(double multiplicand, double multiplier) {
        BigDecimal b1 = new BigDecimal(Double.toString(multiplicand));
        BigDecimal b2 = new BigDecimal(Double.toString(multiplier));
        return b1.divide(b2).doubleValue();
    }
}
