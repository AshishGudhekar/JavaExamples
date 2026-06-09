package com.java.enums;

public class TaskUtil {

    public static int getEstimatedCompletionTime(PriorityEnum priority) {
        return switch (priority){
            case LOW -> 7;
            case MEDIUM -> 5;
            case HIGH -> 2;
            case URGENT -> 1;
        };

        //OR we can use below switch condition.

//        int days = 0;
//        switch (priority) {
//            case LOW:
//                days = 7;
//                break;
//            case MEDIUM:
//                days = 5;
//                break;
//            case HIGH:
//                days = 2;
//                break;
//            case URGENT:
//                days = 1;
//                break;
//        }
//        return days;

    }
}
