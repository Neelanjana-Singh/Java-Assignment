package com.techlabs.array;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int array[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int result[] = new int[n];
        int start = 0;
        int end = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int left = array[start] * array[start];
            int right = array[end] * array[end];

            if (left > right) {
                result[i] = left;
                start++;
            } 
            else {
                result[i] = right;
                end--;
            }
        }

        System.out.print("Sorted squares of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
