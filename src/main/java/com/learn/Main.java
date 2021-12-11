package com.learn;

public class Main {
    public static void main(String[] args) {
StudentProfil studentProfil1 = new StudentProfil("Mircea" , "Marinel", "Sport", 3.75, 2022);

StudentProfil studentProfil2 = new StudentProfil("Vasile" , "Minelo", "Informatica", 3.88, 2021);

studentProfil1.incrementExpectedYearToGraduate();
        System.out.println(studentProfil1.expectedYearToGraduate);
studentProfil2.incrementExpectedYearToGraduate();
        System.out.println(studentProfil2.expectedYearToGraduate);
    }
}
