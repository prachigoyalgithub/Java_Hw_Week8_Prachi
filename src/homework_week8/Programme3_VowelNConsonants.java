package homework_week8;

import java.util.Scanner;

public class Programme3_VowelNConsonants {
    public static void main(String[] args) {
        //scanner start
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.next();
        //Nested if else method use
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Input is not a single letter.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
        scanner.close(); // scanner close
    }
}

