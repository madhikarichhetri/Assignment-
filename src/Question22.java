import java.util.Scanner;
// displaying table of provided number
public class Question22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Table of: " + num);
        System.out.println("-----------------");
        for (int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
