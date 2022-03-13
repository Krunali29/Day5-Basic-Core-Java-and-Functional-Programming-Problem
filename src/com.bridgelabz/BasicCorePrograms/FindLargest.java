package com.bridgelabz.BasicCorePrograms;
//Basic Core Programs
//Que.10
//Java Program to Find the Largest Among Three Numbers.

import java.util.Scanner;

public class FindLargest
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1=scanner.nextInt();
        System.out.println("Enter Second Number :");
        int num2=scanner.nextInt();
        System.out.println("Enter Third Number :");
        int num3=scanner.nextInt();
        //18>=20 &&
        if(num1>=num2 && num1>=num3)
        {
            System.out.println(num1+" is the Largest Number");
        }else if(num2>=num1 && num2>=num3)
        {
            System.out.println(num2+" is the Largest Number");
        }
        else
        {
            System.out.println(num3+" is the Largest Number");
        }
    }
}