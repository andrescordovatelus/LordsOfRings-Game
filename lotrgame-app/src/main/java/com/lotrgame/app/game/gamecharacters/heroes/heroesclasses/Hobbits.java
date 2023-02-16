package com.lotrgame.app.game.gamecharacters.heroes.heroesclasses;

import com.lotrgame.app.game.gamecharacters.heroes.Heroes;

public class Hobbits extends Heroes {

    public Hobbits() {
        super();
        this.hateAgainstOrcs = 0;
        this.fearAgainstTrasgos = 5;
        this.healthPoint = 200;
        this.armor = (int) (this.healthPoint * 0.15);
    }

    @Override
    public int randomPower() {
        int finalPower = 0;
        int powerOne = (int) (Math.random() * 100 + 1);
        int powerTwo = (int) (Math.random() * 100 + 1);

        if (powerOne > powerTwo) {
            finalPower = powerOne;
        } else {
            finalPower = powerTwo;
        }
        return finalPower;
    }

    @Override
    public String toString() {
        return "Hobbits";
    }

    public int getHealthPoint() {
        return this.healthPoint;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    public int getArmor() {
        return armor;
    }
}
