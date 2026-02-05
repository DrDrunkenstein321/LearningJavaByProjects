package org.example.projects;

import java.util.Scanner;


public class SimpleCalculator {
    public static double calc(double x, double y, String symbol) {
        if(symbol.equals("+")) {
            return(x + y);
        } else if(symbol.equals("-")) {
            return(x - y);
        } else if(symbol.equals("*")) {
            return(x * y);
        } else if(symbol.equals("/")) {
            if(y != 0) {
                return(x / y);
            }
            throw new IllegalArgumentException("divide by zero");
        }
        throw new IllegalArgumentException("unknown operation: " + symbol);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number (x) is: ");
        double x = scanner.nextDouble();
        System.out.print("Second number (y) is: ");
        double y = scanner.nextDouble();
        System.out.print("What's operation do you need: ");
        String symbol = scanner.next();
        try {
            double res = calc(x, y, symbol);
            System.out.printf("Result is: %.2f\n", res);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
