package com.programming.exercises;

import java.util.Scanner;

public class FizzBuzz {

    public FizzBuzz() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Integer.parseInt(input.nextLine());

        System.out.println("Result: "+ identifyFizzBuzz(number));
    }

    // an algorithm for identifying whether a number is a
    // Fizz, Buzz or FizzBuzz. If numbers are neither, it
    // will return the input number as string type.
    public String identifyFizzBuzz(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }else if(number % 3 == 0) {
            return "Fizz";
        }else if(number % 5 == 0) {
            return "Buzz";
        }else{
            return String.valueOf(number);
        }
    }

    public static void main(String[] args) {
        new FizzBuzz();
    }
}
