package com.java24hours; 

class SpaceRemover {
    public static void main(String[] arguments) {
        String mostFamous = "Rudolph the Red-Nosed Reindeer";
        char[] mfl = mostFamous.toCharArray();
        for (int i = 0; i < mfl.length; i++) {
            char current = mfl[i];
            if (current != ' ') {
                System.out.print(current);
            }
            else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}