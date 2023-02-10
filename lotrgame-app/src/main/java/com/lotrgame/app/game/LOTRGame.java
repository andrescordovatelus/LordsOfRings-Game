package com.lotrgame.app.game;

import java.util.ArrayList;

public class LOTRGame {
    private Armies armies;
    private Turns turns;
    private Board board;
    private int squadSize;



    public LOTRGame() {

    }

    public void setGame(){
        armies = new Armies();

        armies.addCharacters();

        board = new Board(armies.getSquadA(),armies.getSquadB());



        
        turns = new Turns(armies,board);

        while(turns.isAnyArmyDefeated()){
            turns.startTurn();

        }

        



    }

    public void execute(){
        
    }


}
