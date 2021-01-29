package com.grishin.example2.chassis;

public class VanChassis implements Chassis {

    private String parts;

    public VanChassis() {
        this.parts = "parts of van chassis";
    }

    public String getChassisParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "VanChassis{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
