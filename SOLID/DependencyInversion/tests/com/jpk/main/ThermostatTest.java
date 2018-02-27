package com.jpk.main;

import com.jpk.sensors.MechanicalSensor;
import com.jpk.switchers.PushButtonSwitch;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThermostatTest {

    @Test
    public void testingButtonSwitch_shouldBeAbleToSwitchOn(){
        Thermostat thermostat = new Thermostat();
        thermostat.turnOff(new MechanicalSensor(), new PushButtonSwitch());
    }
}