package com.lotrgame.app.game.gamecharacters.beasts.beastclasses;

import com.lotrgame.app.game.gamecharacters.beasts.Beasts;

public class Trasgos extends Beasts{
    
    public Trasgos(){
        super();
        this.strenghtBonusAgainstAll = 0;
        this.healthPoint = 325;
    }

    @Override
    public int randomPower() {
        int power1 = (int)(Math.random()*90 + 1);
        System.out.println("Dado1: " + power1);
        return power1;
    }

    @Override
    public String toString() {
        return "Trasgos";
    }
}
