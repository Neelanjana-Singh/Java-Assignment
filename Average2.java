package com.techlabs.array;
import java.util.Scanner;

public class Average2 {

    public static boolean findPair(int[] array, int size) {
        int sum = 0;
        double average;
        boolean pair = false;

        if (size <= 1) {
            System.out.println("Provide valid size:");
        }

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        average = (double) sum / size;

        // Sort the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }

        int left = 0;
        int right = size - 1;
        while (left < right) {
            double pairSum = array[left] + array[right];
            if (pairSum == average) {
                pair = true;
                break;
            } else if (pairSum < average) {
                left++;
            } else {
                right--;
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean pair = findPair(array, n);

        if (pair) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }

}
