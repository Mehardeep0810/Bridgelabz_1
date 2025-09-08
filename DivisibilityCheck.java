package Assigned1;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Check divisibility using ternary operator
        String result = (num % 3 == 0 && num % 5 == 0) ? 
                        "Divisible by both 3 and 5" : 
                        "Not divisible by both 3 and 5";

        // Display result
        System.out.println(result);

        sc.close();
    }
}