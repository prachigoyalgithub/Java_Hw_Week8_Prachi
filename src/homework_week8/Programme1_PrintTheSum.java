package homework_week8;

import java.util.Scanner;

public class Programme1_PrintTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (count < 10) {
            int order = count + 1;
            System.out.print("Enter number #" + order + ": ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // Consume the newline character left by nextInt()
        }

        System.out.println("Sum of the 10 numbers is: " + sum);
        scanner.close();
    }
}
