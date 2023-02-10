package com.lotrgame.app.game;

import java.util.ArrayList;
import java.util.Scanner;

public class LOTRGame {
    private Armies armies;
    private Turns turns;
    private Board board;
    private int squadSize;



    public LOTRGame() {

    }

    public void setGame(){
        Scanner s = new Scanner(System.in);
        armies = new Armies();

        armies.addCharacters();

        board = new Board(armies.getSquadA(),armies.getSquadB());



        
        turns = new Turns(armies,board);

        while(!turns.isAnyArmyDefeated()){
            turns.startTurn();

            System.out.println("Presio");
           // s.wait();

        }


    }

    public void execute(){
        
    }


}
