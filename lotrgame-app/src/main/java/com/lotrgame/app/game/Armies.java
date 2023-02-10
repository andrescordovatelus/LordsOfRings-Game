package com.lotrgame.app.game;

import java.util.ArrayList;

import com.lotrgame.app.game.gamecharacters.beasts.Beasts;
import com.lotrgame.app.game.gamecharacters.beasts.beastclasses.Orcs;
import com.lotrgame.app.game.gamecharacters.beasts.beastclasses.Trasgos;
import com.lotrgame.app.game.gamecharacters.heroes.Heroes;
import com.lotrgame.app.game.gamecharacters.heroes.heroesclasses.Elves;
import com.lotrgame.app.game.gamecharacters.heroes.heroesclasses.Hobbits;
import com.lotrgame.app.game.gamecharacters.heroes.heroesclasses.Human;

public class Armies {
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

            
            System.out.println("Estan atacandoooooo");
        }

    }
    

    
    public void addCharacters(){
        squadA = new ArrayList<>();
        squadB = new ArrayList<>();
        Human a = new Human();
        squadA.add(a);
        Human b = new Human();
        squadA.add(b);
        Human c = new Human();
        squadA.add(c);
        Hobbits h = new Hobbits();
        squadA.add(h);
        Elves e = new Elves();
        squadA.add(e);


        Trasgos p = new Trasgos();
        squadB.add(p);
        Trasgos v = new Trasgos();
        squadB.add(v);
        Trasgos o = new Trasgos();
        squadB.add(o);
        Orcs n = new Orcs();
        squadB.add(n);
        Orcs m = new Orcs();
        squadB.add(m);

    }

    public ArrayList<Heroes> getSquadA() {
        return squadA;
    }

    public ArrayList<Beasts> getSquadB() {
        return squadB;
    }
    
}
