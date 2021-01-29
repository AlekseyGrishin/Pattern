package com.grishin.example2.vehicle;

public class Van {

    private Body body;
    private ControlSystem controlSystem;

    public static class Builder {
        Van van = new Van();

        public Builder() {
        }

        public Builder body(Body body) {
            van.body = body;
            return this;
        }

        public Builder controlSystem(ControlSystem controlSystem) {
            van.controlSystem = controlSystem;
            return this;
        }

        public Van build() {
            return van;
        }
    }


    @Override
    public String toString() {
        return "Van{" +
                "body=" + body +
                ", controlSystem=" + controlSystem +
                '}';
    }
}
