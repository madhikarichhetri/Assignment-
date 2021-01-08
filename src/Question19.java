import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: date
 */

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of one side: ");
        int a = input.nextInt();
        System.out.print("Enter length of second side: ");
        int b = input.nextInt();
        System.out.print("Enter length of third side: ");
        int c = input.nextInt();

        if (a != b && b != c && a != c)
            System.out.println("Scalene Triangle");

        else if (a == b && b == c)
            System.out.println("Equilateral Triangle");
            else
                System.out.println("Iscoselos Triangle");

        }
    }


