package edu.gatech.buildgt.smudgebudge.model;

import java.util.Random;

public class Game {

    private int score;
    private int misses;
    private int currentState;
    private Random randNumGenerator = new Random();
    private Client client;

    public Game() {
        this.score = 0;
        this.misses = 0;
        this.setCurrentState();

        //TODO: FIX BROKEN CLIENT CONNECTION
        //this.client = new Client();
    }

    /**
     * @returns the current score
     */
    public int correctGuess() {
        this.setScore(this.getScore() + 1);
        return score;
    }

    /**
     *
     * @return the current number of misses
     */
    public int incorrectGuess() {
        this.setMisses(this.getMisses() + 1);
        return misses;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMisses() {
        return this.misses;
    }

    public void setMisses(int misses) {
        this.misses = misses;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState() {
        int powerOfTwo = randNumGenerator.nextInt(8);
        currentState = (int) Math.pow(2, powerOfTwo);
    }

    public void sendMessage() {
        client.sendMessage(currentState);
    }




}
