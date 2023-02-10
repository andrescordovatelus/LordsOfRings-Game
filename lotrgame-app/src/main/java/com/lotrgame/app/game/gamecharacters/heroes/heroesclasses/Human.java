package com.lotrgame.app.game.gamecharacters.heroes.heroesclasses;

import com.lotrgame.app.game.gamecharacters.heroes.Heroes;

public class Human extends Heroes{

    protected final int hateAgainstOrcs = 0;
    protected final int fearAgainstTrasgos = 0;
    
    public Human(){
        //TODO
    }

    @Override
    public int randomPower() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int getHateAgainstOrcs() {
        return hateAgainstOrcs;
    }

    public int getFearAgainstTrasgos() {
        return fearAgainstTrasgos;
    }

    @Override
    public String toString() {
        return "Human";
    }
}
