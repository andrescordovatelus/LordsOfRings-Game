package com.lotrgame.app.game;

public class Turns {
    private Armies armies;
    private Board board;

    public Turns(Armies armies, Board board) {
        this.armies = armies;
        this.board = board;
    }

    public void setArmiesForFight() {
        armies.addCharacters();
    }

    public void startTurn() {
        armies.attack();
    }

    public Armies getArmies() {
        return armies;
    }

    public boolean isAnyArmyDefeated() {
        if (armies.getSquadA().size() == 0 || armies.getSquadB().size() == 0) {
            return true;

        }
        return false;
    }
}
