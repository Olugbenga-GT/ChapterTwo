//WORLD POPULATION CALCULATOR

import java.util.Scanner;

public class Exercise_Two_ThirtyFour {
    public static void main(String[] args) {
        System.out.println("What's the current World population ?");
        Scanner input = new Scanner(System.in);
             long population = input.nextLong();
        System.out.println("What's the current growth rate ?");
             double rate = input.nextDouble();
            long result = (long) rate * population;
        System.out.printf("The current population is %d%n%n for the year 2020", population);
        System.out.printf("The current population is %d%n%n for the year 2021", result);
        System.out.printf("The current population is %.1f%n%n for the year 2022", result * rate);
        System.out.printf("The current population is %.1f%n%n for the year 2023", result * (rate*rate));
        System.out.printf("The current population is %.1f%n%n for the year 2024", result * (rate*rate*rate));
        System.out.printf("The current population is %.1f%n%n for the year 2025", result * (rate*rate*rate*rate));
        System.out.printf("The current population is %.1f%n%n for the year ----", result * (rate*rate*rate*rate*rate));



    }
}
