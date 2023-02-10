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

    public Armies(){

    }


    void attack(){
        int sizeSquad = 0;
        if(squadB.size() >= squadA.size()){
            sizeSquad = squadA.size();
        } 
        else{
            sizeSquad = squadB.size();
        }

        for (int i = 0; i < sizeSquad; i++) {
            //TODO Logica de los vergazons entre armies
            //getClass getName

            System.out.println(squadA.get(i).toString());   
            System.out.println("Estan atacandoooooo");

            //int resolve = squadA.get(i).randomPower() + squadA.get(i).

            //squadB.get(i).setHealthPoint(resolve);
        }

        // SQUADA PEGA
        // squadB.healpoints -= squadA.randomPower() + hateAgainstOrcs - fearAgainstTrasgos
        
        // SQUADB PEGA
        // squadA.healpoints -= squadB.(randomPower() + randomPower()*strenghtBonusAgainstAll)

        // IF(squadA =< 0)
        //     remove
        
        // IF(squadB =< 0)
        //     remove

    }
    

    
    public void addCharacters(){
    CharacterFactory characterFactory = new CharacterFactory();
    squadA = new ArrayList<>();
    squadB = new ArrayList<>();   

    
    for (int i = 0; i < ElvesHC; i++) {
        squadA.add(characterFactory.getNewCharacter("Elves"));
    }
    for (int i = 0; i < HobbitsHC; i++) {
        squadA.add(characterFactory.getNewCharacter("Hobbits"));
    }
    for (int i = 0; i < HumansHC; i++) {
        squadA.add(characterFactory.getNewCharacter("Human"));
    }
    for (int i = 0; i < OrcsHC; i++) {
        squadB.add(characterFactory.getNewCharacter("Elves"));
    }
    for (int i = 0; i < TrasgosHC; i++) {
        squadB.add(characterFactory.getNewCharacter("Hobbits"));
    }
    

    }

    public ArrayList<Character> getSquadA() {
        return squadA;
    }

    public ArrayList<Character> getSquadB() {
        return squadB;
    }
    
}
