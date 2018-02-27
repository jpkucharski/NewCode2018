package com.jpk.main;

import com.jpk.sensors.Sensorable;
import com.jpk.switchers.Switchable;

public class Thermostat {

    private double desireTemperature;


    public void setDesireTemperature(double desireTemperature) {
        this.desireTemperature = desireTemperature;
    }

    public void turnOn(Sensorable sensorType, Switchable switchType) {
        if (sensorType.getTemperature() < desireTemperature) {
            switchType.on();
        }
    }

    public void turnOff(Sensorable sensorType, Switchable switchType) {
        if (sensorType.getTemperature() > desireTemperature) {
            switchType.off();
        }
    }

    public void reset() {

    }

}
