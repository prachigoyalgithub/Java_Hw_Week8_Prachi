package homework_week8;

import java.util.Scanner;

public class Programme5_Palindrome {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            boolean isPalindrome = isPalindrome(number);

            if (isPalindrome) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        }

        public static boolean isPalindrome(int number) {
            if (number < 0) {
                number = Math.abs(number);
            }

            int originalNumber = number;
            int reverse = 0;

            while (number > 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number /= 10;
            }

            return originalNumber == reverse;
        }
    }








