package org.example;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 3, 7, 15, 4, 10};


        int firstLargest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] < firstLargest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSecond largest number: " + secondLargest);
    }
}
