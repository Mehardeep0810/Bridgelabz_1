package Assigned1;

import java.util.Scanner;

public class StopAtSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // To print characters until a space is found
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                break; // TO stop when space is found
            }

            System.out.println(ch);
        }

        sc.close();
    }
}
