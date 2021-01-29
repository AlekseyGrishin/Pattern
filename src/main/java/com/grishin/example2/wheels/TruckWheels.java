package com.grishin.example2.wheels;

public class TruckWheels implements Wheels {

    private String parts;

    public TruckWheels() {
        this.parts = "parts of truck wheels";
    }

    public String getWheelsParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "TruckWheels{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
