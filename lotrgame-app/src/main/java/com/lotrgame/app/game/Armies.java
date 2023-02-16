package com.lotrgame.app.game;

import java.util.ArrayList;
import java.util.Scanner;

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

    public Armies() {

    }

    void attack() {
        int sizeSquad = Math.min(squadB.size(), squadA.size());
        System.out.println();
        System.out.println("Numero de rondas " + sizeSquad);
        System.out.println();
        String divider = "----------------------------------------------------------------------------------------";

        for (int i = 0; i < sizeSquad; i++) {
            Scanner s = new Scanner(System.in);

            System.out.println("INICIANDO RONDA : " + (i + 1));

            System.out.println("ESCUADRON DE HEROES  :"+squadA.toString());
            System.out.println("ESCUADRON DE BESTIAS :"+squadB.toString());
            System.out.println();
            System.out.println(divider);

            damageCalculator(i);

            sizeSquad = Math.min(squadB.size(), squadA.size());
            System.out.println(divider);
            System.out.println("Presiona enter para el siguiente turno");
            System.out.println(divider);
            s.nextLine();

        }

        System.out.println("----------Descartando jugadores muertos---------");


        squadA.removeIf( (n) -> (
            (n.getHealthPoint()<=0)

        ));

        squadB.removeIf( (n) -> (
            (n.getHealthPoint()<=0)

        ));

    }

    public void damageCalculator(int i) {
        System.out.println("----------Iniciando ronda " + (i+1) + " Los personajes a enfrentarse son: " +
                squadA.get(i).toString().toUpperCase() + " VS " + squadB.get(i).toString().toUpperCase()+"----------");
        System.out.println();

        System.out.println("--"+
                squadA.get(i).toString() + " Posee " + squadA.get(i).getHealthPoint() + "hp" + " armadura "+squadA.get(i).getArmor());
        System.out.println("--"+
                squadB.get(i).toString() + " Posee " + squadB.get(i).getHealthPoint() + "hp" + " armadura "+squadB.get(i).getArmor());
        System.out.println();

        int squadADamaged = squadA.get(i).randomPower() + squadA.get(i).getHateAgainstOrcs() - squadA.get(i).getFearAgainstTrasgos();

        int squadBInicialAttack = squadB.get(i).randomPower();

        int squadBDamaged = squadBInicialAttack + (int) (squadBInicialAttack * squadB.get(i).getStrenghtBonusAgainstAll());

        int vidaA = squadA.get(i).getHealthPoint();
        int resolveforA = vidaA - squadBDamaged;

        int vidaB = squadB.get(i).getHealthPoint();
        int resolveforB = vidaB - squadADamaged;

        // Atacan a squad B
        if(squadB.get(i).getArmor()<squadADamaged){
            if (resolveforB <= 0 && squadA.get(i).getHealthPoint()>0) {
                System.out
                    .println("--El ataque de " + squadA.get(i).toString() + " hacia " + squadB.get(i).toString() + " es de :"
                            + squadADamaged+"--");
                System.out.println("**** "+squadB.get(i) + " HA SIDO VENCIDO ****");
                System.out.println("----------------------------------------------------");
                squadB.get(i).setHealthPoint(resolveforB);
            } else if (resolveforB > 0 && squadA.get(i).getHealthPoint()>0) {
                System.out
                    .println("--El ataque de " + squadA.get(i).toString() + " hacia " + squadB.get(i).toString() + " es de :"
                            + squadADamaged+"--");
                squadB.get(i).setHealthPoint(resolveforB);
                System.out.println("***VIDA RESTANTE DE " + squadB.get(i).toString().toUpperCase()+ " :" + squadB.get(i).getHealthPoint()+"***");
                System.out.println();
            } else if (squadA.get(i).getHealthPoint() <= 0) {
                System.out.println(squadA.get(i).toString() + " no pudo atacar porque fue vencido");
            }
        }else if(squadB.get(i).getArmor()>= squadADamaged && squadA.get(i).getHealthPoint()>0){
            System.out.println("--El ataque de " + squadA.get(i).toString() + " hacia " + squadB.get(i).toString() + 
            " fallo al no superar su armadura--");
            System.out.println();
        }

        // Atacan a squad A
        if(squadA.get(i).getArmor()<squadBDamaged){
            if (resolveforA <= 0 && squadB.get(i).getHealthPoint()>0) {
                System.out
                    .println("--El ataque de " + squadB.get(i).toString() + " hacia " + squadA.get(i).toString() + " es de :"
                            + squadBDamaged+"--");
                System.out.println("**** "+squadA.get(i) + " HA SIDO VENCIDO ****");
                System.out.println("----------------------------------------------------");
                squadA.get(i).setHealthPoint(resolveforA);
                
            } else if (resolveforA > 0 && squadB.get(i).getHealthPoint()>0 ) {
                System.out
                    .println("--El ataque de " + squadB.get(i).toString() + " hacia " + squadA.get(i).toString() + " es de :"
                            + squadBDamaged+"--");
                squadA.get(i).setHealthPoint(resolveforA);
                System.out.println("***VIDA RESTANTE DE " + squadA.get(i).toString()+" :" + squadA.get(i).getHealthPoint()+"***");
                System.out.println();
                
            } else if (squadB.get(i).getHealthPoint() <= 0) {
                System.out.println(squadB.get(i).toString() + " no pudo atacar porque fue vencido");
            }
        } else if(squadA.get(i).getArmor()>= squadBDamaged && squadB.get(i).getHealthPoint()>0){
            System.out.println("--El ataque de " + squadB.get(i).toString() + " hacia " + squadA.get(i).toString() + 
            " fallo al no superar su armadura--");
            System.out.println();
        }
        

    }

    public void addCharacters() {
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
