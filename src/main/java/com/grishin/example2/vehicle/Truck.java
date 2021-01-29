package com.grishin.example2.vehicle;

public class Truck {

    private Body body;
    private ControlSystem controlSystem;

    public static class Builder {
        Truck truck = new Truck();

        public Builder() {
        }

        public Builder body(Body body) {
            truck.body = body;
            return this;
        }

        public Builder controlSystem(ControlSystem controlSystem) {
            truck.controlSystem = controlSystem;
            return this;
        }

        public Truck build() {
            return truck;
        }
    }


    @Override
    public String toString() {
        return "Truck{" +
                "body=" + body +
                ", controlSystem=" + controlSystem +
                '}';
    }
}
