package com.lotrgame.app.game.gamecharacters.heroes.heroesclasses;
import com.lotrgame.app.game.gamecharacters.heroes.Heroes;

public class Hobbits extends Heroes{
    
    public Hobbits(){
        super();
        this.hateAgainstOrcs = 0;
        this.fearAgainstTrasgos = 5;
        this.healthPoint = 200;
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

    @Override
    public String toString() {
        return "Hobbits";
    }

    public int getHealthPoint(){
        return this.healthPoint;
    }

}
