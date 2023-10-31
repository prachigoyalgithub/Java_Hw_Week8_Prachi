package homework_week8;

public class Programme15_leftAngleTriangle {
    public static void main(String[] args) {
        int n = 5; // Change the value of 'n' to adjust the number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  "); // Print spaces for alignment
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}



