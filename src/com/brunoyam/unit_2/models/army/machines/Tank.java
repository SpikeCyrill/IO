package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.Shooter;

public class Tank extends AbstractMachine implements Shooter {

    private Integer power;

    public Tank(Integer power, Integer fuel, Integer armor, Integer maxSpeed) {
        super(fuel, armor, maxSpeed);
        this.power = power;
    }

    @Override
    public Integer getPower() {
        return power;
    }
}
