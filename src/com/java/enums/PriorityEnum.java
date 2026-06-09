package com.java.enums;

/**
 * instead of using constants for each value we can use enums example:
 * public static final LOW = 7;
 * public static final MEDIUM = 5;
 * public static final HIGH = 2;
 * public static final URGENT = 1;
 * we can use enum class which internally make variable static AND final like below.
 */

public enum PriorityEnum {
    LOW, HIGH, MEDIUM, URGENT;
}
