package homework_week8;

import java.util.Scanner;

public class Programme11_EvenDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            int evenSum = getEvenDigitSum(number);

            if (evenSum != -1) {
                System.out.println("Sum of even digits: " + evenSum);
            } else {
                System.out.println( evenSum);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }
}
