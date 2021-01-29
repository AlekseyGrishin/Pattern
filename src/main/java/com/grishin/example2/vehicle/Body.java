package com.grishin.example2.vehicle;

import com.grishin.example2.chassis.Chassis;
import com.grishin.example2.engine.Engine;
import com.grishin.example2.steering.Steering;
import com.grishin.example2.wheels.Wheels;

public class Body {
    private final Chassis chassis;
    private final Engine engine;
    private final Wheels wheels;
    private final Steering steering;

    public Body(Chassis chassis, Engine engine, Wheels wheels, Steering steering) {
        this.chassis = chassis;
        this.engine = engine;
        this.wheels = wheels;
        this.steering = steering;
    }

    @Override
    public String toString() {
        return "Body{" +
                "chassis=" + chassis +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", steering=" + steering +
                '}';
    }
}
