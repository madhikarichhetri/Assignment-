import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int  sum = (num*(num+1))/2; // sum of natural number is n(n+1)/2

        System.out.println("The sum of "+ num + " natural number is: "+ sum);
    }
}
