package com.grishin.example2.vehicle;

public class Car {

    private Body body;
    private ControlSystem controlSystem;

    public static class Builder {
        Car car = new Car();

        public Builder() {
        }

        public Builder body(Body body) {
            car.body = body;
            return this;
        }

        public Builder controlSystem(ControlSystem controlSystem) {
            car.controlSystem = controlSystem;
            return this;
        }

        public Car build() {
            return car;
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", controlSystem=" + controlSystem +
                '}';
    }
}
