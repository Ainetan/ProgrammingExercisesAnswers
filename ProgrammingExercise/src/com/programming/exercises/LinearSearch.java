package com.programming.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    private final Scanner input;
    private final Random random;
    private final int[] numbers;

    public LinearSearch() {
        input = new Scanner(System.in);
        random = new Random();
        numbers = new int[10];

        generateValues();

        System.out.println("Elements on the list: "+ Arrays.toString(numbers));
        System.out.print("Element to find: ");
        int elementToFind = Integer.parseInt(input.nextLine());

        int result = linearSearch(numbers, elementToFind);
        System.out.printf("\nThe element '%d' can%sbe found on the list%s%n", elementToFind,
                (result == -1) ? "not " : " ", (result == -1) ?
                        "." : " at index "+ result);
    }

    // responsible for generating random values in a list from 1 - 100
    public void generateValues() {
        for(int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
    }

    // an algorithm for identifying whether a list contains an element.
    // if found, it will return the index where it can be accessed
    // or else return -1
    public int linearSearch(int[] numbers, int elementToFind) {
        // automatic conversion from - Integer -> int data type
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new LinearSearch();
    }
}
