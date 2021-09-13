package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount: ");
        int Principal = input.nextInt();
        System.out.print("What is the rate as a whole percentage: ");
        double rate = input.nextDouble();
        System.out.print("What is the number of years: ");
        int time = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year: ");
        int compound = input.nextInt();
        double interestRate = rate/100;

        double CI = Principal * Math.pow((1+(interestRate/compound)), (compound*time));
        System.out.printf("$%d invested at %.2f%% for %d years, compounded %d times per year is $%.2f.", Principal, rate, time, compound, CI);


    }
}
