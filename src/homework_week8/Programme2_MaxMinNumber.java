package homework_week8;

import java.util.Scanner;

public class Programme2_MaxMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // while loop used
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break; // Exit the loop if an invalid number is entered
            }
            scanner.nextLine(); // Consume the newline character
        }

        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No valid numbers entered.");
        } else {
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
        }
        scanner.close();
    }
}
