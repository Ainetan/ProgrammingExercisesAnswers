package com.programming.exercises;

import java.util.Arrays;

public class FindMaximum {

    private final int[] numbers = new int[] {7, -5, 3, 2, 1, 0, 45};

    public FindMaximum() {
        System.out.println("Elements in array: "+ Arrays.toString(numbers));
        System.out.println("Largest number in array: "+ findLargestNumber(numbers));
    }

    // an algorithm for finding the largest number in an array.
    public int findLargestNumber(int[] numbers) {
        int largestNumber = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        new FindMaximum();
    }
}
