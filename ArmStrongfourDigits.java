package interview.level1programs;

public class ArmStrongfourDigits {

	public static void main(String[] args) {
        int start = 1000;
        int end = 9999;

        System.out.println("4-digit Armstrong numbers:");

        for (int number = start; number <= end; number++) {
            if (isArmstrongNumber(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;
        int numberOfDigits = 4;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }

}
