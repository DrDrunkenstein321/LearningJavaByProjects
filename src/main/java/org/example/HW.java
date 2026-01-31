package org.example;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("+---+");
        System.out.println("|aaa|");
        System.out.println("+---+");

        // Problem 2
        System.out.print("What's a: ");
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        double area = side * side;
        double perimeter = 4d * side;
        double diagonal = Math.sqrt(side * side + side * side);
        System.out.printf("The area is: %f, The Perimeter is: %f, The diagonal is: %f \n", area, perimeter, diagonal);

        // Problem 3
        System.out.print("Enter your grade in terms of number: ");
        double grade = in.nextDouble();
        String yourLetter = "";
        if(grade > 100 || grade < 0) System.out.println("Invalid grade");
        else if(grade >= 95) yourLetter = "A";
        else if(grade >= 90) yourLetter = "A-";
        else if(grade >= 85) yourLetter = "B+";
        else if(grade >= 80) yourLetter = "B";
        else if(grade >= 75) yourLetter = "B-";
        else if(grade >= 70) yourLetter = "C+";
        else if(grade >= 65) yourLetter = "C";
        else if(grade >= 60) yourLetter = "C-";
        else if(grade >= 55) yourLetter = "D+";
        else if(grade >= 50) yourLetter = "D";
        else yourLetter = "F";

        if(!yourLetter.isEmpty()) System.out.printf("Your grade is: %s\n", yourLetter);

        // Problem 4
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if(a == 0) {
            System.out.printf("It's not a quadratic equation");
            return;
        }

        double d = b * b - 4 * a * c;
        if(d < 0) System.out.println("Error bro");
        else{
            double sqrtD = Math.sqrt(d);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            System.out.printf("First root: %f, Second root: %f\n", x1, x2);
        }

        //Problem 5
        double yourDeposit = in.nextDouble();
        double yourPercent = in.nextDouble();
        double interest = yourDeposit * (yourPercent / 100);
        double newBalance = yourDeposit + interest;
        System.out.printf("Old balance is: %f, New balance is: %f\n", yourDeposit, newBalance);

        // Problem 6
        System.out.println("Enter a string to check a palindrome: ");
        String user = in.nextLine();
        System.out.println(isPalindrome(user));

    }
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

}
