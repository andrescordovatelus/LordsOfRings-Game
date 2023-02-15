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

        turns.setArmiesForFight();

        while(!turns.isAnyArmyDefeated()){
            turns.startTurn();

            System.out.println("Presiona enter para el siguiente turno");
            s.nextLine();

        }

        System.out.println("Prueba de ifs");
        
        if(turns.getArmies().getSquadA().size()==0){
            System.out.println("EQUIPO 2 GANO");

           }else if(turns.getArmies().getSquadB().size()==0){
            System.out.println("EQUIPO 1 GANO");
           }


    }

    public void execute(){
        
    }


}
