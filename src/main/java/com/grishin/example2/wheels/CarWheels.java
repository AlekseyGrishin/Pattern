package com.grishin.example2.wheels;

public class CarWheels implements Wheels {

    private String parts;

    public CarWheels() {
        this.parts = "parts of car wheels";
    }

    public String getWheelsParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "CarWheels{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
