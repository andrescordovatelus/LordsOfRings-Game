package com.lotrgame.app.game.gamecharacters;

public abstract class Character {
    protected String name;
    protected int healthPoint;
    protected int position;
    protected boolean aliveStatus;

    public void atack(){
        //TODO
    }

    public void getAtack(){
        //TODO
    }

    public abstract int randomPower();
}
