package homework_week8;

public class Programme13_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));  // Should return true
        System.out.println(hasSharedDigit(9, 99));    // Should return false
        System.out.println(hasSharedDigit(15, 55));   // Should return true
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        int firstDigitNum1 = num1 % 10;
        int secondDigitNum1 = num1 / 10;
        int firstDigitNum2 = num2 % 10;
        int secondDigitNum2 = num2 / 10;

        return (firstDigitNum1 == firstDigitNum2) || (firstDigitNum1 == secondDigitNum2) ||
                (secondDigitNum1 == firstDigitNum2) || (secondDigitNum1 == secondDigitNum2);
    }
}
