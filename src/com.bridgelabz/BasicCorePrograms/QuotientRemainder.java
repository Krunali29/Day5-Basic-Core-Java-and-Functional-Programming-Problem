package com.bridgelabz.BasicCorePrograms;
//Basic Core Programs
//Que.6
//Java Program to Compute Quotient and Remainder.

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Dividend number: ");
        int dividend=scanner.nextInt();
        System.out.println("Enter Divisor number: ");
        int divisor=scanner.nextInt();

        int quotient=dividend / divisor;
        int remainder= dividend % divisor;

        System.out.println("The Quotient is = "+quotient);
        System.out.println("The Remainder is = "+remainder);
    }
}