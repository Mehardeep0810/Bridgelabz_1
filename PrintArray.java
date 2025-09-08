package Assigned1;

import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nYou entered:");
        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}

