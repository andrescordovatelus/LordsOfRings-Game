package com.lotrgame.app.game.gamecharacters.heroes.heroesclasses;

import com.lotrgame.app.game.gamecharacters.heroes.Heroes;

public class Human extends Heroes{
    
    public Human(){
        super();
        this.fearAgainstTrasgos = 0;
        this.hateAgainstOrcs = 0;
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
