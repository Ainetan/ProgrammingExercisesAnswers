package com.programming.exercises;

import java.util.Scanner;

public class Palindrome {

    private final Scanner input;

    public Palindrome() {
        input = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = input.nextLine();

        boolean result = isPalindrome(word);
        System.out.printf("'%s' - it is%sa palindrome%n", word,
                result ? " " : " not ");
    }

    // an algorithm for identifying whether a word is a palindrome or not.
    public boolean isPalindrome(final String word) {
        for(int i = 0, j = word.length() - 1; i < (word.length() / 2); i++, j--) {
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Palindrome();
    }
}
