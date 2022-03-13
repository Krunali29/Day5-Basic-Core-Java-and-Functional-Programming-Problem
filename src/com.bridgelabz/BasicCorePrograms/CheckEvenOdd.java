package com.bridgelabz.BasicCorePrograms;
//Basic Core Programs
//Que.8
//Java Program to Check Whether a Number is Even or Odd.
import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user

        System.out.println("Enter the Number");

        int num = sc.nextInt();

        // check the remainder is 0 or not

        if (num % 2 == 0) {

            System.out.println("Given Number is even");

        } else

            System.out.println("Given Number is odd");
    }
}