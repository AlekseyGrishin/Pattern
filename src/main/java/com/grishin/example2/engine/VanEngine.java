package com.grishin.example2.engine;

public class VanEngine implements Engine {

    private String parts;

    public VanEngine() {
        this.parts = "parts of van engine";
    }

    public String getEngineParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "VanEngine{" +
                "parts='" + parts + '\'' +
                '}';
    }
}
