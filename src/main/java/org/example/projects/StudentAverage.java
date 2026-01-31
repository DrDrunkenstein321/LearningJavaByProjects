package org.example.projects;


import java.util.Scanner;

public class StudentAverage {
    public static char GetLetter(double x) {
        if(x >= 85) return 'A';
        else if(x >= 75) return 'B';
        else if(x >= 65) return 'C';
        else return 'F';

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <= 0) {
            System.out.println("Enter n > 0");
            return;
        }
        double total = 0;
        for(int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            total += number;
        }
        double average = total / n;
        System.out.printf("Your average grade is: %f", average);
        System.out.printf("Your letter grade is: %c", GetLetter(average));
    }
}
