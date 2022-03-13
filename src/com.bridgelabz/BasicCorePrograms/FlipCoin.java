package com.bridgelabz.BasicCorePrograms;
//Basic Core Programs
//Que.1
//Flip Coin and print percentage of Heads and Tails.
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {	//main method

        //declaration

        int head=0;

        int tail=0;

        int i=1;

        // Get input from the user

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number of time to flip the coin");

        int num=sc.nextInt();

        // check  the condition



        while (i <= num) {

            double a=Math.random(); /// check the random method

            if (a < 0.5) {

                tail++;

            }

            else {

                head++;

            }

            i++;



        }

        System.out.println("Head = "+head);

        System.out.println("Tail = "+tail);

        // Calculating Percentage for Head and Tail



        int Headper=(head*100)/num;

        int Tailper=(tail*100)/num;

        System.out.println("HeadPercentage = "+Headper);

        System.out.println("TailPercentage = "+Tailper);

    }

}


