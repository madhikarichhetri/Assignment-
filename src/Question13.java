import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println(num);
        }
        else{
            System.out.println("No negative numbers entered.");
        }


    }
}

