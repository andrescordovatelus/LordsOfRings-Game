package com.lotrgame.app.game.gamecharacters.heroes.heroesclasses;

import com.lotrgame.app.game.gamecharacters.heroes.Heroes;

public class Human extends Heroes{
    
    public Human(){
        super();
        this.fearAgainstTrasgos = 0;
        this.hateAgainstOrcs = 0;
        this.healthPoint = 180;
    }

    @Override
    public int randomPower() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Human";
    }
}
