package com.lotrgame.app.game;

import com.lotrgame.app.game.gamecharacters.Character;
import com.lotrgame.app.game.gamecharacters.beasts.beastclasses.Orcs;
import com.lotrgame.app.game.gamecharacters.beasts.beastclasses.Trasgos;
import com.lotrgame.app.game.gamecharacters.heroes.heroesclasses.Elves;
import com.lotrgame.app.game.gamecharacters.heroes.heroesclasses.Hobbits;
import com.lotrgame.app.game.gamecharacters.heroes.heroesclasses.Human;

public class CharacterFactory {

    public CharacterFactory(){}

    public Character getNewCharacter(String characterType) {
        if (characterType == null) {
            return null;
        }
        if (characterType.equalsIgnoreCase("elves")) {
            return new Elves();
        } else if (characterType.equalsIgnoreCase("Hobbits")) {
            return new Hobbits();
        } else if (characterType.equalsIgnoreCase("Human")) {
            return new Human();
        } else if (characterType.equalsIgnoreCase("Orc")) {
            return new Orcs();
        } else if (characterType.equalsIgnoreCase("Trasgos")) {
            return new Trasgos();
        }
        return null;
    }
}
