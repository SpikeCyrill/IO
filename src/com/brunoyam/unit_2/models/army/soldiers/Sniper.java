package com.brunoyam.unit_2.models.army.soldiers;

import com.brunoyam.unit_2.models.army.Shootable;
import com.brunoyam.unit_2.models.army.Shooter;

public class Sniper extends AbstractSoldier implements Shootable, Shooter {

    private Integer power;

    public Sniper(Integer power, Integer health, Integer armor, Integer maxSpeed) {
        super(health, armor, maxSpeed);
        this.power = power;
    }

    @Override
    public Integer getPower() {
        return power;
    }

    @Override
    public void getShot(Integer power) {
        setHealth(getHealth() - power);
    }
}
