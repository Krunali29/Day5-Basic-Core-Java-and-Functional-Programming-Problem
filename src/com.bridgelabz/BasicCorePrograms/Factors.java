package com.bridgelabz.BasicCorePrograms;
//Basic Core Programs
//Que.5
//Factors.
import java.util.*;
public class Factors {
    public static void main(String[] args) {

        // Get input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();

        // find prime factors of given number using for loop

        for(int i = 2; i< number; i++)  {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {

            System.out.println(number);

        }

    }


    }

