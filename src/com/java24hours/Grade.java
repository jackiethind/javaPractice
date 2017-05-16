package com.java24hours; 

class Grade {
    public static void main(String[] arguments) {
        int grade = Integer.parseInt(arguments[0]);
        if (grade > 100) {
            System.out.println("Grade is too high!");
        }
        else {
//            if (grade > 90) {
//                System.out.println("You got an A!");
//            } else if (grade > 80) {
//                System.out.println("You got a B!");
//            } else if (grade > 70) {
//                System.out.println("You got a C!");
//            } else if (grade > 60) {
//                System.out.println("You got a D!");
//            } else {
//                System.out.println("You got a F.");
//            }
            switch(grade) {
                case (90):
                    System.out.println("You got an A");
                    break;
                case 80:
                    System.out.println("You got a B");
                    break;
                case 70:
                    System.out.println("You got a C");
                    break;
                case 60:
                    System.out.println("You got a D");
                    break;
                default: 
                    System.out.println("You got a F");
            }
        }
    }
}