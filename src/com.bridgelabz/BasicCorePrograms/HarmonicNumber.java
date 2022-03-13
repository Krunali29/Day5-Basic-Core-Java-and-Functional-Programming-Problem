package com.bridgelabz.BasicCorePrograms;
//Basic Core Programs
//Que.4
//Harmonic Number.
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double result = 0, num = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the harmonic number you want to find: ");

        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            num=num + ((float) 1/i);
            result=num;
        }
        System.out.println("The value of Harmonic no. "+n+" is: "+result);
    }
}