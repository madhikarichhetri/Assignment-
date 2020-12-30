import java.util.Scanner;

public class Question8 {

    //a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.


        public static void main(String[] args){
            int f;
            int c;

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the fahrenheit: ");
            f = input.nextInt();
            System.out.print("Enter the Celsius: ");
            c = input.nextInt();

            double cel = (f-32)* 0.5566;
            double fah = (c * 1.8) + 32;
            System.out.println( f + "fahrenheit is " + cel + " Celsius" );
            System.out.println( c + "Celsius is " + fah + " Fahrenheit" );

        }

    }




