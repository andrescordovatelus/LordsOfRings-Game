package com.lotrgame.app.game.gamecharacters.heroes.heroesclasses;
import com.lotrgame.app.game.gamecharacters.heroes.Heroes;

public class Hobbits extends Heroes{

    protected final int hateAgainstOrcs = 0;
    protected final int fearAgainstTrasgos = 5;
    
    public Hobbits(){
        //TODO
    }

    public int getFearAgainstTrasgos() {
        return fearAgainstTrasgos;
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

    @Override
    public String toString() {
        return "Hobbits";
    }

}
