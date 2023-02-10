package com.lotrgame.app.game.gamecharacters.beasts.beastclasses;

import com.lotrgame.app.game.gamecharacters.Character;
import com.lotrgame.app.game.gamecharacters.beasts.Beasts;

public class Orcs extends Beasts{
    
    protected double strenghtBonusAgainstAll = 0.10;

    public Orcs(){
        //TODO
    }

    @Override
    public int randomPower() {
        int power1 = (int)(Math.random()*90 + 1);
        System.out.println("Dado1: " + power1);
        return power1;
    }

    public double getStrenghtBonusAgainstAll() {
        return strenghtBonusAgainstAll;
    }

    @Override
    public String toString() {
        return "Orcs";
    }
}
