package com.java24hours;

class Loops {
    public static void main(String[] arguments) {
//        for (int dex = 0; dex < 1000; dex++) {
//            if(dex%12 == 0) {
//                System.out.println("#: " + dex);
//            }
//        }
//        for (int p= 0; p < 500; p++) {
//            System.out.println("I will not sell miracle cures");
//        }
//        int gameLives = 20;
//        while (gameLives > 0) {
//            // the player can still play!
//        }
        
        int limit = 5;
        int count = 1;
        while(count<limit) {
            System.out.println("Pork is not a verb");
            count++;
        }
        
        do {
            System.out.println("I am not allergic to long division");
            count++;
        } while (count < limit);
        // break out early
        int index = 0;
//        while(index <= 1000) {
//            index += 5;
//            if (index == 400) {
//                break;
//            }
//        }
        // continue causes loop to exit its current trip through the loop
       while (index <=1000) {
           index += 5;
           if (index == 400) { // skips 400 on the print below
               continue;
           }
           System.out.println("The index is " + index);
       }
       // naming a loop
       int points = 0;
       int target = 100;
       targetLoop:
       while(target <= 100) {
           for( int i = 0; i < target; i++) {
               if(points > 50) {
               break targetLoop;
               }
               points += i;
           }
       }
       
       int i, j;
       for (i=0, j=0; i*j < 1000; i++, j += 2) {
           System.out.println(i + " * " + j + " = " + (i*j));
       } 
    }
}
