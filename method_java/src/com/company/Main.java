package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        calScore(true, score, levelCompleted, bonus);
        calScore(false, score, levelCompleted, bonus);
        calScore1(true, score, levelCompleted, bonus);
    }

    public static int calScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score=" + finalScore);
            return finalScore;
        }
        return -1;
    }

    // if we use void then no need to put return statement
    public static void calScore1(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score=" + finalScore);
        }
    }
}