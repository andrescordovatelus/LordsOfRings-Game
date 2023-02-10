package com.lotrgame.app.game.gamecharacters.beasts.beastclasses;
import com.lotrgame.app.game.gamecharacters.beasts.Beasts;

public class Orcs extends Beasts{
    
    public Orcs(){
        super();
        this.strenghtBonusAgainstAll = 0.10;
        this.healthPoint = 300;
    }

    @Override
    public int randomPower() {
        int power1 = (int)(Math.random()*90 + 1);
        System.out.println("Dado1: " + power1);
        return power1;
    }

    @Override
    public String toString() {
        return "Orcs";
    }

    public int getHealthPoint(){
        return this.healthPoint;
    }
}
