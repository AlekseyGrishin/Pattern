package com.grishin.example2.engine;


public class CarEngine implements Engine {

    private String parts;

    public CarEngine() {
        this.parts = "parts of car engine";
    }

    public String getEngineParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
