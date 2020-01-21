package com.company.Greenlee;

public class Main {
    // Trenton Greenlee. 1/20/2020. Exercise 2.
    public static void main(String[] args) {
        // Variable/Array Declarations and Assignments.
        int[] highTemperature = {45, 29, 10, 22, 41, 28, 33};
        int[] percipitation = {95, 60, 25, 5, 0, 75, 90};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("This week's days with chances of snow:");
        // Using a for loop to count the number of indexes for each array since all three arrays have the same number of indexes.
        for (int i = 0; i < highTemperature.length; i++) {
            if (highTemperature[i] <= 32 && percipitation[i] > 50) {
                System.out.println(days[i] + " - Temperature: " + highTemperature[i]
                        + "° Fahrenheit; Percipitation: " + percipitation[i] + "%");
            }
        }
    }
}
