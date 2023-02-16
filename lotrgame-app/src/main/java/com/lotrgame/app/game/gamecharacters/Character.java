package com.lotrgame.app.game.gamecharacters;

public abstract class Character {
    protected String name;
    protected int healthPoint;
    protected int position;
    protected int armor;

    public abstract int randomPower();


    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }
    
    public int getArmor() {
        return armor;
    }

    
}

