import java.util.Scanner;

public class Question4 {
    // A program to calculate Simple interest.
    public static void main(String[] args) {
        double P; // principal
        double T; // Time
        double R; // Rate
        double I;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        P = input.nextInt();
        System.out.print("Enter the Time: ");
        T = input.nextInt();
        System.out.print("Enter the Rate: ");
        R = input.nextInt();

        I = (P*T*R)/100;

        System.out.println("The simple interest is :" + I);


    }


}