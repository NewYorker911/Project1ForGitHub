package org.example;

public class MaxMin {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 8, 3, 7, 15, 4, 10};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nMaximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
