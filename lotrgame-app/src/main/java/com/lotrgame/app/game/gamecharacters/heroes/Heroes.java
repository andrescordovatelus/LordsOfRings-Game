package com.lotrgame.app.game.gamecharacters.heroes;

import com.lotrgame.app.game.gamecharacters.Character;

public abstract class Heroes extends Character{

    protected int hateAgainstOrcs;
    protected int fearAgainstTrasgos;

    public int getHateAgainstOrcs() {
        return hateAgainstOrcs;
    }
    public int getFearAgainstTrasgos() {
        return fearAgainstTrasgos;
    }
}
