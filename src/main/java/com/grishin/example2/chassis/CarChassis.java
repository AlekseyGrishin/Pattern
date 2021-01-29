package com.grishin.example2.chassis;

public class CarChassis implements Chassis {

    private String parts;

    public CarChassis() {
        this.parts = "parts of car chassis";
    }

    public String getChassisParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "CarChassis{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
