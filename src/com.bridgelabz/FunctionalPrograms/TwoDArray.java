package com.bridgelabz.FunctionalPrograms;
//Functional Programs
//Que.1
//To print 2 Dimensional Array.
import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDArray
{
    public static void arrayOperations()
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        System.out.println("! Enter the Rows and Columns to form a MATRIX: ");
        int rows = sc.nextInt();
        int colm = sc.nextInt();
        int[][] array = new int[rows][colm]; // declaring array
        System.out.println("Enter array elements: ");
            // taking inputs for rows
        for (int i = 0; i < rows; i++)
        {
                // taking inputs for columns
            for (int j = 0; j < colm; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
            sc.close();
            // printing array elements
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < colm; j++)
                {
                    writer.print(array[i][j] + " ");

                }
                writer.println();
            }
            writer.close();
    }

        public static void main(String[] args)
        {
            arrayOperations();
        }
}

