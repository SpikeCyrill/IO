package com.brunoyam.unit_2.models.army;

public class AbstractUnit {
    private Integer armor;
    private Integer maxSpeed;

    public AbstractUnit(Integer armor, Integer maxSpeed) {
        this.armor = armor;
        this.maxSpeed = maxSpeed;
    }

    public Integer getArmor() {
        return armor;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }
}
