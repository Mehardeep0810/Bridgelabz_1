package Assigned1;

import java.util.Scanner;

public class EasyFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1;

        // To multiply factorial by each number from num down to 1
        while (num > 0) {
            factorial = factorial * num;
            num = num - 1;
        }

        // Display result
        System.out.println("Factorial is: " + factorial);

        sc.close();
    }
}