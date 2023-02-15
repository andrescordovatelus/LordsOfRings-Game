package com.lotrgame.app.game;

import java.util.ArrayList;

import com.lotrgame.app.game.gamecharacters.Character;
import com.lotrgame.app.game.gamecharacters.beasts.Beasts;
import com.lotrgame.app.game.gamecharacters.heroes.Heroes;

public class Armies {
    private int ElvesHC = 2;
    private int HobbitsHC = 2;
    private int HumansHC = 1;
    private int OrcsHC = 3;
    private int TrasgosHC = 2;
    private ArrayList<Heroes> squadA;
    private ArrayList<Beasts> squadB;
    private static int contador = 0;

    public Armies(){

    }


    void attack(){
        int sizeSquad = Math.min(squadB.size(), squadA.size());
        System.out.println();
        System.out.println("SIZE SQUAD " + sizeSquad);
        System.out.println();


        for (int i = 0; i < sizeSquad; i++) {
            int aux = sizeSquad;

            System.out.println(squadA.get(i).toString());   
            System.out.println("Estan atacandoooooo");

            int squadADamaged = squadA.get(i).randomPower() + squadA.get(i).getHateAgainstOrcs() - squadA.get(i).getFearAgainstTrasgos();
            int squadBDamaged = squadB.get(i).randomPower() + (int)(squadB.get(i).randomPower() * squadB.get(i).getStrenghtBonusAgainstAll());

            System.out.println(squadA.toString());
            System.out.println(squadB.toString());

            // for (int j = 0; j < squadA.size(); j++) {
            //     System.out.print(squadA.get(j).toString());
            //     System.out.print(" "+ squadA.get(j).getHealthPoint() + " ");
            // }
            // System.out.println(" \n");

            // for (int j = 0; j < squadB.size(); j++) {
            //     System.out.print(squadB.get(j).toString());
            //     System.out.print(" "+squadB.get(j).getHealthPoint() +" ");
            // }

            System.out.println();



            
            int vidaA = squadA.get(i).getHealthPoint();
            int resolveforA = vidaA - squadBDamaged;
            
            if(resolveforA <= 0){
                squadA.remove(i);
            }
            else{
                squadA.get(i).setHealthPoint(resolveforA);
                System.out.println( "VIDA RESRTANTE " + squadA.get(i).getHealthPoint());
            }


            int vidaB = squadB.get(i).getHealthPoint();
            int resolveforB = vidaB - squadADamaged;

            if(resolveforB <= 0){
                squadB.remove(i);
            }
            else{
                squadB.get(i).setHealthPoint(resolveforB);
                System.out.println( "VIDA RESRTANTE " + squadB.get(i).getHealthPoint());
            }

            sizeSquad = Math.min(squadB.size(), squadA.size());
        }
    }
    
    public void makeDamagedAgainst(int iterador, int vida, int resolve, ArrayList<Character> squad) {
        int vidaB = squad.get(iterador).getHealthPoint();
            int resolve = vida - squadADamaged;

            if(resolveforB <= 0){
                squadB.remove(i);
            }
            else{
                squadB.get(i).setHealthPoint(resolveforB);
                System.out.println( "VIDA RESRTANTE " + squadB.get(i).getHealthPoint());
            }
    }
    
    public void addCharacters(){
    CharacterFactory characterFactory = new CharacterFactory();
    squadA = new ArrayList<>();
    squadB = new ArrayList<>();   

    
    for (int i = 0; i < ElvesHC; i++) {
        squadA.add(characterFactory.getNewCharacterHeroes("Elves"));
    }
    for (int i = 0; i < HobbitsHC; i++) {
        squadA.add(characterFactory.getNewCharacterHeroes("Hobbits"));
    }
    for (int i = 0; i < HumansHC; i++) {
        squadA.add(characterFactory.getNewCharacterHeroes("Human"));
    }
    for (int i = 0; i < OrcsHC; i++) {
        squadB.add(characterFactory.getNewCharacterBeasts("Orcs"));
    }
    for (int i = 0; i < TrasgosHC; i++) {
        squadB.add(characterFactory.getNewCharacterBeasts("Trasgos"));
    }
    

    }

    public ArrayList<Heroes> getSquadA() {
        return squadA;
    }

    public ArrayList<Beasts> getSquadB() {
        return squadB;
    }
    
}
