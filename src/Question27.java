
import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: 1/4/2021
 */
  //a program to sum each digit of given numbers as well as product.

public class Question27 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = input.nextInt();
        int sum =0;
        int mul =1;
    while(num != 0) {
         sum = sum + num%10;
         mul = mul * (num%10);
        num = num/10;
    }
        System.out.println("The sum of given digit " + sum);
        System.out.println("The product of given digit is " + mul);

    }
}
