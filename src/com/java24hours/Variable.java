package com.java24hours;

class Variable {
    public static void main(String[] arguments) {
        int tops;
        float gradePointAverage;
        char key = 'C';
        String productName = "Larvets";
        byte escapeKey = 27;
        short roomNumber = 222;
        long salary = 264400000L;
        long salaryUnderscore = 264_400_000;
        boolean gameOver = false;
//        double pi = 3.14;
        int mileage = 300;
        int totalMileage = mileage;
        float pi = 3.14F;
        double price = 2.99D;
        // constants 
        final int TOUCHDOWN = 6;
        final int FIELDGOAL = 3;
        final int PAT = 1;
        // addition
        double weight = 205;
        weight += 10;
        // subtraction
        weight -= 15;
        // division 
        weight = weight/3;
        // remainder 
        int remainder = 245 % 3;
        // multiplication 
        int score = 10;
        int total = 500 + (score*12);
        int power = 10;
        int rating = 10;
        // postfixing increment
        power++;
        // postfixing decrement
        rating--;
        // prefixing increment
        ++power;
        // prefixing decrement 
        --rating;
        int x = 3; 
        int answer = x++ * 10;
        // answer will equal to 30 because postfixed increment was used instead of prefixed increment
        // so postfixed actually does this:
        // int answer = x * 10;
        // x++;
        // increments after the expression has been evaluated
        int y = 3;
        int answer2 = ++y * 10;
        // answer will equal to 40 because prefixed increment was used 
        // so prefixed actually does this:
        // y++;
        // int answer2 = y * 10;
        // Operator precedence 
        int z = 10;
        z = y*3 +5;
        // java evaluation order: ++ / --, * / / / %, + / -, comparisons, =
        
    }
}