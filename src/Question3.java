import java.util.Scanner;

public class Question3 {
    //A program to find sum and average of two number.
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        int avg;
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the first number:");
        a = input.nextInt();
        System.out.print("Enter the Second number:");
        b = input.nextInt();
     // calculation
         sum = a+b;
        avg = sum/2;

        System.out.print("Sum is " + sum + "\naverage is " + avg);



    }
}
