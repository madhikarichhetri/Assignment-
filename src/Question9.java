import java.util.Scanner;

public class Question9 {
    // a program that converts pounds into kg. The program prompts the user
    // to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].

    public static void main(String[] args){
        int p;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weights in pounds: ");
        p = input.nextInt();

        double kg = p/2.2046;
        System.out.println( p + "pound is " + kg + " kg" );

    }
}
