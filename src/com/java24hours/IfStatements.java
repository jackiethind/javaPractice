package com.java24hours;

class IfStatements {
    public static void main(String[] arguments) {
        long account = -17_000_000_000_000L;
        if (account < 0) {
            System.out.println("Account overdrawn: you need a bailout");
        }
        int elephantWeight = 900;
        int elephantTotal = 13;
        int cleaningExpense = 200;
        
        if(elephantWeight > 780) {
            System.out.println("Elephant too big for tightrope act");
        }
        
        if(elephantTotal > 12) {
            cleaningExpense += 150;
        }
        if (account <= 0 ) {
            System.out.println("You are flat broke");
        }
        
        if (account <= 0 ) System.out.println("No more money!"); // only excecuted if true
        
        int answer = 17;
        int correctAnswer = 13;
        int score = 100;
        if (answer == correctAnswer) {
            score += 10; 
            System.out.println("That's right. You get 10 points!");
             System.out.println("Your score: " + score);
        }
        else {
            score -= 5;
            System.out.println("Sorry, that's wrong. You lose 5 points");
            System.out.println("Your score: " + score);
        }
        // switch cases, NEED BREAK STATEMENTS and a DEFAULT STATEMENT
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("You got an A. Awesome!");
                break;
            case 'B': 
                System.out.println("You got a B. Beautiful!");
                break;
            case 'C':
                System.out.println("You got a C. Concerning!");
                break;
            case 'D':
                System.out.println("You got a D. Danger!");
                break;
            default: 
                System.out.println("You got an F.");
        }
        
        // Ternary Operator
        int skillLevel = 3;
//        if (skillLevel > 5) {
//            numberOfEnemies = 20;
//        } else {
//            numberOfEnemies = 10;
//        }
        // can be written as
        int numberOfEnemies = (skillLevel > 5) ? 20 : 10;
        
        String gender = "male";
        String name = "David";
        System.out.print((gender.equals("male")) ? "Mr." : "Ms.");
        System.out.print(name);
    }
}