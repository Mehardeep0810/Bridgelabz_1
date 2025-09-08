package Assigned1;

import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find the greater number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }
}
