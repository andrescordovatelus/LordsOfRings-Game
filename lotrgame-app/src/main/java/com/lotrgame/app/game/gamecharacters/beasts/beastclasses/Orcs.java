package com.lotrgame.app.game.gamecharacters.beasts.beastclasses;
import com.lotrgame.app.game.gamecharacters.beasts.Beasts;

public class Orcs extends Beasts{
    
    public Orcs(){
        super();
        this.strenghtBonusAgainstAll = 0.10;
        this.healthPoint = 300;
        this.armor = (int)(this.healthPoint*0.15);
    }

    @Override
    public int randomPower() {
        int power1 = (int)(Math.random()*90 + 1);
        return power1;
    }

    @Override
    public String toString() {
        return "Orcs";
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    public int getHealthPoint(){
        return this.healthPoint;
    }

    public double getStrenghtBonusAgainstAll() {
        return strenghtBonusAgainstAll;
    }
    public int getArmor() {
        return armor;
    }
}
