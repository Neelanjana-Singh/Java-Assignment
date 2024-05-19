package com.techlabs.array;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        
        System.out.println("Enter number of rows of the first array:");
        int row1 = scanner.nextInt();
        System.out.println("Enter number of columns of the first array:");
        int col1 = scanner.nextInt();
        int[][] array1 = new int[row1][col1];
        System.out.println("Enter Number of rows of the second array:");
        int row2 = scanner.nextInt();
        System.out.println("Enter the number of columns of the second array:");
        int col2 = scanner.nextInt();
        int[][] array2 = new int[row1][col1];
        if (row1 <= 0 || col1 <= 0 || row2<=0 || col2<=0 || col1 != row2) {
            System.out.println("Multiplication not possible.");
            
        }
        else
        {
        System.out.println("Enter  elements of the first array:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }

       
       
        
        int[][] result = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        
        System.out.println("Resultant array after multiplication:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        }

        scanner.close();
    }
}
