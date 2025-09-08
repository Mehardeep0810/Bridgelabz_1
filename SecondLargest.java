package Assigned1;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        // Input 10 numbers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Display result
        System.out.println("\nSecond largest number is: " + secondLargest);

        sc.close();
    }
}
