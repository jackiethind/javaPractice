package com.java24hours;

class Game {
    public static void main(String[] arguments) {
        int total = 0;
        int score = 7;
        if (score == 7) {
            System.out.println("You scored a touchdown");
        }
        if (score == 3) {
            System.out.println("You kicked a field goal!");
        }
        total += score;
        System.out.println("Total score: " + total);
        
        int playerScore = 12000;
        int playerLives = 3;
        int difficultyLevel = 10;
        
        if (playerScore > 9999) {
            playerLives++;
            System.out.println("Extra life acquired!");
            difficultyLevel += 5;
        }
    }
}