package Assigned1;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50:");

        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;

            // Check divisibility from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print if prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}