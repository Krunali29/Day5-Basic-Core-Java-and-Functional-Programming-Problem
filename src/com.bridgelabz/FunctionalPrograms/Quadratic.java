package com.bridgelabz.FunctionalPrograms;
//Functional Programs
//Que.4
//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
import java.util.Scanner;
public class Quadratic
{
    //static variables
    public static double a,b,c,delta,root1,root2;
    public static void QuadraticRoots()
    {
        System.out.println("Enter the values of a,b & c : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        delta =  ((Math.pow(b, 2)) - (4*a*c));
        System.out.println(delta);
        if(delta>0)
        {
            root1 =  (double)((-b + Math.sqrt(delta))/(2*a));
            root2 =  (double)((-b + Math.sqrt(delta))/(2*a));
            System.out.println(" Roots of the Equation ax^2+bx+c : " );
            System.out.println("Root1 = "+root1+" Root2 = "+root2);
        }
        else
            System.out.println("Imaginary roots have entered");
        sc.close();
    }

    public static void main(String[] args)
    {
        QuadraticRoots(); //calling method
    }
}

