//Create a program that uses a multidimensional array to store student grades. 
//The first dimension should be a number for each student, and the second dimension 
//should be for each student's grades. Display the average of all grades earned by 
//each student and an overall average for every student




package com.java24hours; 

class StudentGrades {
    public static void main(String[] arguments) {
        int[][] student = new int[6][6];
        int[] jackie = {90, 80, 85, 85, 90, 84 };
        int[] joey = {90, 70, 65, 95, 70, 84 };
        int[] nicki = { 85,80,85,95,100,100 };
        int[] bernice = { 80,90,90,80,85,95 };
        int[] ernest = { 75,45,80,95,90,90 };
        int[] bigMike = { 90,90,90,95,70,65 };
        student[0] = jackie;
        student[1] = joey;
        student[2] = nicki;
        student[3] = bernice;
        student[4] = ernest;
        student[5] = bigMike;
        int gradeSum = 0;
        int[] studentSum = new int[6];
        // Loop through the students
        for (int i=0; i< 6; i++) {
            System.out.println("Student #" + i);
            studentSum[i] = 0;
            // Loop through each student's grades
            for (int j = 0; j <6; j++) {
                gradeSum = gradeSum + student[i][j];
                studentSum[i] = studentSum[i] + student[i][j];
            }
            System.out.println(" Average grade: " + studentSum[i]/6);
        }
        System.out.println("\nAverage grade of all students: " + gradeSum/36);
    }
}