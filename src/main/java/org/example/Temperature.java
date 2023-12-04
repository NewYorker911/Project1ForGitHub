package org.example;

public class Temperature {
    public static void main(String[] args) {

        double[] temperatures = {25.5, 23.0, 28.2, 22.8, 26.1, 24.7, 27.5};


        double highestTemperature = temperatures[0];
        double lowestTemperature = temperatures[0];

        System.out.println("Temperatures for the week:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C");


            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
            }

            if (temperatures[i] < lowestTemperature) {
                lowestTemperature = temperatures[i];
            }
        }

        System.out.println("Highest temperature: " + highestTemperature);
        System.out.println("Lowest temperature: " + lowestTemperature);
    }
}
