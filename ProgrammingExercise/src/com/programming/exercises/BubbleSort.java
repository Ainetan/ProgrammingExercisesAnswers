package com.programming.exercises;

import java.util.Arrays;

public class BubbleSort {

    private final int[] numbers = new int[] {7, -5, 3, 2, 1, 0, 45};

    public BubbleSort() {
        System.out.println("Original Array: "+ Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Sorted Array: "+ Arrays.toString(numbers));
    }

    // a bubble sort algorithm to sort elements in an array
    public void bubbleSort(int[] numbers) {
        int length = numbers.length;
        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; j < (length - i - 1); j++) {
                if(numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        new BubbleSort();
    }
}
