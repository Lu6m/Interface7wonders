package com.example.interface7wonders;

import java.util.ArrayList;
import java.util.Collections;

public class Game {

    /* ******/
    public static Game option;
    public static void playGame() {
        Game.option = new Game();
    }
    /* ******/


    private static int nbPlayers;
    private ArrayList listMerveilles = new ArrayList<>();



    public void setNbPlayers(int nbPlayers) {
        this.nbPlayers = nbPlayers;
    }
    public static int getNbPlayers() {
        return nbPlayers;
    }


    public void createListeMerveilles(){
        this.listMerveilles.add(new Wonder("Ephèse","Images/deck-ephese.png"));
        this.listMerveilles.add(new Wonder("Alexandrie","Images/deck-alexandrie.png"));
        this.listMerveilles.add(new Wonder("Babylon","Images/deck-babylon.png"));
        this.listMerveilles.add(new Wonder("Cizeh","Images/deck-cizeh.png"));
        this.listMerveilles.add(new Wonder("Halicarnasse","Images/deck-halicarnasse.png"));
        this.listMerveilles.add(new Wonder("Olympie","Images/deck-olympie.png"));
        this.listMerveilles.add(new Wonder("Rhodes","Images/deck-rhodes.png"));
        Collections.shuffle(this.listMerveilles);

        }

    public ArrayList<Wonder> getListMerveilles() {
        return this.listMerveilles;
    }
}