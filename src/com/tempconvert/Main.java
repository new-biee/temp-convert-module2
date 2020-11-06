package com.tempconvert;

import java.util.Scanner;

public class Main {
    public static double celsiusToFahrenheit(double celsius) {
        double f = (9.0 / 5) * celsius + 32;
        return f;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double c = (5.0 / 9) * (fahrenheit - 32);
        return c;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Choice 0 to 2:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
