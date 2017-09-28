package com.holms.unit9;

import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

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

    public void printArray(int[] srcArray) {

    }

    public int[] sortIntegers(int[] srcArray) {

        return null;
    }
}
