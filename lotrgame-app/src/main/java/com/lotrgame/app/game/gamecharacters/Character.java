package com.lotrgame.app.game.gamecharacters;

public abstract class Character {
    protected String name;
    protected int healthPoint;
    protected int position;

    public abstract int randomPower();

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}

