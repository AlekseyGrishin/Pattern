package com.grishin.example2.wheels;

public class VanWheels implements Wheels {

    private String parts;

    public VanWheels() {
        this.parts = "parts of van wheels";
    }

    public String getWheelsParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "VanWheels{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
