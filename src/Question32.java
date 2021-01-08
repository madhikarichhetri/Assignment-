import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: jan 2020
 */
// a Program to accept 5 values in an array and display their sum
public class Question32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] =new int[5];
        int i; int sum = 0;
        System.out.print("Enter a number: ");
        for(i=0; i<5;i++){
            a[i] = input.nextInt();
        }
        for (i=0;i<5;i++){
            sum = sum + a[i];
        }
        System.out.println("sum of given array is " + sum);

    }

}
