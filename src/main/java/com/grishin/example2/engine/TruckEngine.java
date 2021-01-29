package com.grishin.example2.engine;

public class TruckEngine implements Engine {

    private String parts;

    public TruckEngine() {
        this.parts = "parts of truck engine";
    }

    public String getEngineParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "TruckEngine{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
