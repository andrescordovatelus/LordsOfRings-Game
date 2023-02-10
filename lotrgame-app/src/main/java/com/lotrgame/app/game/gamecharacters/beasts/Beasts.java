package com.lotrgame.app.game.gamecharacters.beasts;

import com.lotrgame.app.game.gamecharacters.Character;

public abstract class Beasts extends Character{

    protected double strenghtBonusAgainstAll;

    public Beasts(){
        super();
    }

    public int getHealthPoint(){
        return healthPoint;
    }

  /*   public void setHealthPoint(int healthPoints){
        this.healthPoint = healthPoints;
    }
    */


    public double getStrenghtBonusAgainstAll() {
        return strenghtBonusAgainstAll;
    }
}
