package Assigned1;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest: " + interest);

        sc.close();
    }
}
