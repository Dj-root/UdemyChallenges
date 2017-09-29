package com.holms.unit9;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sortedInts = sortIntegers(myIntegers);
        System.out.println("\nArray was sorted in desceding order2" );
        printArray(sortedInts);
    }


    // Method to implement
    public static int[] getIntegers(int number) {
        System.out.println("Type " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] srcArray) {
        System.out.println("Your array contains:");
        for (int i = 0; i < srcArray.length; i++) {
            System.out.println("Element " + i + ": " + srcArray[i]);
        }

    }

    public static int[] sortIntegers(int[] srcArray) {
        int swap;
        int[] sortedArray = Arrays.copyOf(srcArray, srcArray.length);

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = sortedArray.length-1; j > 0; j--) {
                if (sortedArray[j] > sortedArray[j - 1]) {
                    swap = sortedArray[j];
                    sortedArray[j] = sortedArray[j - 1];
                    sortedArray[j - 1] = swap;

                    continue;
                }
            }
        }

        return sortedArray;
    }
}
