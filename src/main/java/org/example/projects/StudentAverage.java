package org.example.projects;


import java.util.Scanner;

public class StudentAverage {
    public static char getLetter(double x) {
        if(x >= 85) return 'A';
        else if(x >= 75) return 'B';
        else if(x >= 65) return 'C';
        else return 'F';

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades do you have: ");
        int n = scanner.nextInt();
        if(n <= 0) {
            System.out.println("Enter n > 0");
            return;
        }
        double total = 0;
        for(int i = 0; i < n; i++) {
            System.out.printf("Enter grade %d: \n", i + 1);
            int number = scanner.nextInt();
            if(number < 0 || number > 100) {

                System.out.println("Enter a number in range of 0-100");
                return;
            }
            total += number;
        }
        double average = total / n;
        System.out.printf("Your average grade is: %.2f\n", average);
        System.out.printf("Your letter grade is: %c", getLetter(average));
    }
}
