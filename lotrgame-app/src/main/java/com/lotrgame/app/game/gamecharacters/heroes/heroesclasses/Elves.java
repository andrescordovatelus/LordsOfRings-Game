package com.lotrgame.app.game.gamecharacters.heroes.heroesclasses;

import com.lotrgame.app.game.gamecharacters.heroes.Heroes;

public class Elves extends Heroes{

    public Elves(){
        super();
        this.hateAgainstOrcs = 10;
        this.fearAgainstTrasgos = 0;
    }

    @Override
    public int randomPower() {
        int finalPower=0;
        int powerOne = (int)(Math.random()*100 +1);
        int powerTwo = (int)(Math.random()*100 +1);

        System.out.println("Power1 " + powerOne);
        System.out.println("Power2 " + powerTwo);


        if(powerOne > powerTwo){
            finalPower = powerOne;
        }
        else{
            finalPower = powerTwo;
        }

        System.out.println("final" + finalPower);
        return finalPower;
    }

    public int getHateAgainstOrcs() {
        return hateAgainstOrcs;
    }

    public int getFearAgainstTrasgos() {
        return fearAgainstTrasgos;
    }

    @Override
    public String toString() {
        return "Elves";
    }

    
}
