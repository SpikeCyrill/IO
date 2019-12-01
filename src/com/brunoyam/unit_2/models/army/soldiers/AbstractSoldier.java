package com.brunoyam.unit_2.models.army.soldiers;

import com.brunoyam.unit_2.models.army.AbstractUnit;

public class AbstractSoldier extends AbstractUnit {
    private Integer health;

    public AbstractSoldier(Integer health, Integer armor, Integer maxSpeed) {
        super(armor, maxSpeed);
        this.health = health;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
