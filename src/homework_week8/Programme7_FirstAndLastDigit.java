package homework_week8;

import java.util.Scanner;

public class Programme7_FirstAndLastDigit {
    public static void main(String[] args) {
        //scanner used
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sumFirstAndLastDigit(number);
            //Nested if else used
            if (result != -1) {
                System.out.println("Sum of the first and last digit: " + result);
            } else {
                System.out.println("Parameter is negative and needs to be positive : " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close(); // scanner closed
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
