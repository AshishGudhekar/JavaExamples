package com.java.functionalprogramming.lambda;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 * Without accepting any input always returns a value.
 * Example:
 * generating reports or OTP's where we don't provide any input.
 */

public class SupplierDemo {
    static void main(String[] args) {
        Supplier<Integer> getCurrentMonth = () -> LocalDate.now().getMonthValue();
        System.out.println(getCurrentMonth.get());

        Supplier<String> getCurrentDayName = () -> LocalDate.now().getDayOfWeek().name();
        System.out.println(getCurrentDayName.get());
    }
}
