package Assigned1;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Convert to miles
        double miles = kilometers * 0.621371;

        // Display result
        System.out.println("Distance in miles: " + miles);

        sc.close();
    }
}