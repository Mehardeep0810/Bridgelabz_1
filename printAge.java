package Assigned1;

import java.util.Scanner;

public class printAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int years = sc.nextInt();
        System.out.println("You are " + years + " years old");
        sc.close();
    }
}
