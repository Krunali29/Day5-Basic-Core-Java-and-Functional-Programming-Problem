package com.bridgelabz.BasicCorePrograms;
//Basic Core Programs
//Que.9
//Java Program to Check Whether an Alphabet is Vowel or Consonant.
import java.util.Scanner;
public class CheckAlphabet
{
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the alphabet");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U')
        {
            System.out.println("this alphabet is vowel::" + ch);
        } else
        {
            System.out.println(" is consonant");
        }

    }
}