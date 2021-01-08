import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2020
 */
//Java Program to find the sum of a Series 1/1! + 2/2! + 3/3! + 4/4! +…….+ n/n! .
public class Question29 {


    public static double naturalnum_factorialnum(double num) {
        double result = 0, factorial_num = 1;
        for (int i = 1; i <= num; i++) {
            factorial_num = factorial_num * i;
            result = result + (i / factorial_num);
        }
        return (result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value of n: ");
        int num = input.nextInt();

        System.out.println("The sum of the series is : " + naturalnum_factorialnum(num));

        //factorial
        System.out.println("factorial of:"+num +" is " +factorial(num) );

        //calling methods
        System.out.println("series valie by second style:"+ getFactorialSeriesValue(num));

    }


    static double getFactorialSeriesValue(int n) {
        double result = 0.0;
        for (int i = 0; i <=n; i++) {
            result += i/factorial(i);
        }
        return result;
    }


    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
}

