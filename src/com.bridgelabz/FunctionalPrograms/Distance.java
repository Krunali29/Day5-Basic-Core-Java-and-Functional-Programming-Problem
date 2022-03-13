package com.bridgelabz.FunctionalPrograms;
//Functional Programs
//Que.3
//Write a program Distance.java .
import java.util.Scanner;
public class Distance
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four integers (a,b,c,d): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int n = display(a, b, c, d);
        System.out.print(n);
    }
    public static int display(int a, int b, int c, int d)
    {
        long q = (int) Math.round(Math.sqrt(a*b + c*d));
        return (int) q;
    }
}

