package com.grishin.example2.vehicle;

import com.grishin.example2.brakes.ABS;
import com.grishin.example2.climate.AirConditioning;
import com.grishin.example2.climate.ClimateControlSystem;
import com.grishin.example2.climate.SeatHeating;

public class ControlSystem {

    private final ClimateControlSystem climateControlSystem;
    private final AirConditioning airConditioning;
    private final SeatHeating seatHeating;
    private final ABS abs;

    public ControlSystem(ClimateControlSystem climateControlSystem, AirConditioning airConditioning, SeatHeating seatHeating, ABS abs) {
        this.climateControlSystem = climateControlSystem;
        this.airConditioning = airConditioning;
        this.seatHeating = seatHeating;
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "ControlSystem{" +
                "climateControlSystem=" + climateControlSystem +
                ", airConditioning=" + airConditioning +
                ", seatHeating=" + seatHeating +
                ", abs=" + abs +
                '}';
    }
}
