package com.java.enums;

public class Exercise1Demo {

        public static enum VehicleType{
            CAR, MOTORCYCLE, BUS, TRUCK;

        }

        public static double calculateToll(VehicleType type) {
            return switch (type) {
                case CAR -> 5.0;
                case MOTORCYCLE -> 3.0;
                case BUS -> 10.0;
                case TRUCK -> 15.0;
            };

//            for (VehicleType vehicleType: VehicleType.values()){
//                String name = vehicleType.name();
//                toll = vehicleType.getTollForVehicle();
//                System.out.println(name + " -> " + toll);
//            }
        }
}
