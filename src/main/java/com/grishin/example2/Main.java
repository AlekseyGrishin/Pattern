package com.grishin.example2;

import com.grishin.example2.brakes.ABS;
import com.grishin.example2.chassis.CarChassis;
import com.grishin.example2.climate.AirConditioning;
import com.grishin.example2.climate.ClimateControlSystem;
import com.grishin.example2.climate.SeatHeating;
import com.grishin.example2.engine.CarEngine;
import com.grishin.example2.steering.StandardSteering;
import com.grishin.example2.vehicle.Body;
import com.grishin.example2.vehicle.Car;
import com.grishin.example2.vehicle.ControlSystem;
import com.grishin.example2.vehicle.Van;
import com.grishin.example2.wheels.CarWheels;

public class Main {

    public static void main(String[] args) {
        // Примените шаблон, благодаря которому не нужно будет заполнять все аргументы такого большого конструктора каждый раз при создании объекта

        Body body = new Body(new CarChassis(), new CarEngine(), new CarWheels(), new StandardSteering());
        ControlSystem controlSystem = new ControlSystem(new ClimateControlSystem(), new AirConditioning(), new SeatHeating(), new ABS());

        Van van = new Van.Builder().body(body).build();
        Car car = new Car.Builder().body(body).controlSystem(controlSystem).build();

        System.out.println(van);
        System.out.println(car);
        // some action with vehicle
    }


}
