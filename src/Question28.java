
import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: 11/4/2021
 */

public class Question28 {
    public static boolean isPrimeNumber(int num) {
        boolean prime = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = true;
                break;
            }
            if (!prime) {
                System.out.println("prime number");
            } else {
                System.out.println("Not prime number");
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        isPrimeNumber(number);
    }
}
