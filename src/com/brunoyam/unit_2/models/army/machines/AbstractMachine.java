package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.AbstractUnit;

public class AbstractMachine extends AbstractUnit {

    private Integer fuel;

    public AbstractMachine(Integer fuel, Integer armor, Integer maxSpeed) {
        super(armor, maxSpeed);
        this.fuel = fuel;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }
}
