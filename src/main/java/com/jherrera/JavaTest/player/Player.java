package com.jherrera.JavaTest.player;

public class Player {
    private static Dice dice;
    private static int minNumberWin;

    public Player(Dice dice, int minNumberWin) {
        this.dice = dice;
        this.minNumberWin = minNumberWin;
    }

    public static boolean play(){
        int diceNumber = dice.roll();
        return diceNumber > minNumberWin;
    }
}
