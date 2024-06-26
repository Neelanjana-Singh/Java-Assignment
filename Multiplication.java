package com.techlabs.array;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows of the first matrix:");
        int row1 = scanner.nextInt();
        System.out.println("Enter number of columns of the first matrix:");
        int column1 = scanner.nextInt();
        int[][] matrix1 = new int[row1][column1];

        System.out.println("Enter number of rows of the second matrix:");
        int row2 = scanner.nextInt();
        System.out.println("Enter number of columns of the second matrix:");
        int column2 = scanner.nextInt();
        int[][] matrix2 = new int[row2][column2];

        if (row1 <= 0 || column1 <= 0 || row2 <= 0 || column2 <= 0 || column1 != row2) {
            System.out.println("Multiplication not possible.");

        } else {
            System.out.println("Enter elements of the first matrix:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            int[][] result = new int[row1][column2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("Resultant matrix after multiplication:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
