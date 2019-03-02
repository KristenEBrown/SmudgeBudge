package edu.gatech.buildgt.smudgebudge.model;

public class Game {

    private int score;
    private int misses;

    public Game() {
        this.score = 0;
        this.misses = 0;
    }

    public int getScore() {
        return score;
    }

    public int getMisses() {
        return this.misses;
    }

}
