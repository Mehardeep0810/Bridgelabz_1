package Assigned1;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // To add the last digit to sum
            number /= 10;       // To remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
