package com.lotrgame.app.game;
import com.lotrgame.app.game.gamecharacters.Character;

import java.util.ArrayList;

public class Helper {

    private ArrayList<Character> squadA = new ArrayList<>();
    private ArrayList<Character> squadB = new ArrayList<>();

    private CharacterFactory characterFactory = new CharacterFactory();

    private int ElvesHC = 3;
    private int HobbitsHC = 3;
    private int HumansHC = 4;
    private int OrcsHC = 5;
    private int TrasgosHC = 5;

    public Helper(){
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
    void attack(){

    }

    void defend(){

    }

    ArrayList<Character> getCharacters(){
        return this.characters;
    }
}
