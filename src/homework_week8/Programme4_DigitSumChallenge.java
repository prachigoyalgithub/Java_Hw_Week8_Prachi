package homework_week8;

import java.util.Scanner;

public class Programme4_DigitSumChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sumDigits(number);
            if (result != -1) {
                System.out.println("Sum of digits: " + result);
            } else {
                System.out.println("Invalid input. Please enter a number >= 10.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
    // static int method used
    public static int sumDigits(int number) {
        if (number < 10 || number < 0) {
            return -1;
        }

        int sum = 0;
        // while method used
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}

