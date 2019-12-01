package com.brunoyam.unit_2.models.army;

public interface Shooter {
    Integer getPower();
    default void shot(Shootable shooter){
        shooter.getShot(getPower());
    }
}
