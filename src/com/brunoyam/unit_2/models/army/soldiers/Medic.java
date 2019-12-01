package com.brunoyam.unit_2.models.army.soldiers;

import com.brunoyam.unit_2.models.army.Shootable;

public class Medic extends AbstractSoldier implements Shootable {

    public Medic(Integer health, Integer armor, Integer maxSpeed) {
        super(health, armor, maxSpeed);
    }

    @Override
    public void getShot(Integer power) {
        setHealth(getHealth() - power);
    }
}
