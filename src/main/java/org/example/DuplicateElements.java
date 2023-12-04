package org.example;

public class DuplicateElements {
    public static void main(String[] args) {
        String[] strings = {"apple", "orange", "banana", "apple", "grape", "banana", "kiwi"};

        for (int i = 0; i < strings.length; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    System.out.print(strings[i] + " ");
                    break;
                }
            }
        }

    }
}

