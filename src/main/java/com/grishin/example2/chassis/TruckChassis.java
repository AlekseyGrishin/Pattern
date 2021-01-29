package com.grishin.example2.chassis;

public class TruckChassis implements Chassis {

    private String parts;

    public TruckChassis() {
        this.parts = "parts of truck chassis";
    }

    public String getChassisParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "TruckChassis{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
