package edu.gatech.buildgt.smudgebudge.model;

import java.util.Random;

public class Game {

    private int score;
    private int misses;
    private int currentState;
    private Random randNumGenerator = new Random();

    public Game() {
        this.score = 0;
        this.misses = 0;
        this.setCurrentState();
    }

    public int getScore() {
        return score;
    }

    public int getMisses() {
        return this.misses;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState() {
        int powerOfTwo = randNumGenerator.nextInt(13) + 1;
        currentState = (int) Math.pow(2, powerOfTwo);
    }


}
