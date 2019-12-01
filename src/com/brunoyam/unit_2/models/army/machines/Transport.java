package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.Shootable;

public class Transport extends AbstractMachine implements Shootable {

    public Transport(Integer fuel, Integer armor, Integer maxSpeed) {
        super(fuel, armor, maxSpeed);
    }

    @Override
    public void getShot(Integer power) {
        setFuel(getFuel() - power);
    }
}
