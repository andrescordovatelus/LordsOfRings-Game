package com.lotrgame.app.game.gamecharacters;

public abstract class Character {
    protected String name;
    protected int healthPoint;
    protected int position;
    protected boolean aliveStatus;

    public abstract int randomPower();
}

