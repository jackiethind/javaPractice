package com.java24hours;

class Squared {
    public static void main(String[] arguments) {
        int x = Integer.parseInt(arguments[0]);
        int y = Integer.parseInt(arguments[1]);
        int squaredSum = (x*x) + (y*y);
        System.out.println("The squared sum of "
        + x
        + " and "
        + y 
        + " is "      
        + squaredSum
        );
    }
}