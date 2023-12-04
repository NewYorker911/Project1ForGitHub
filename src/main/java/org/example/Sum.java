package org.example;

public class Sum {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 8, 3, 7};


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println(sum);
        }

    }

