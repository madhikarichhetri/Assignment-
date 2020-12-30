import java.util.Scanner;
public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Factorial of: "+num);
        System.out.println("---------------");
        int fact = 1;
        for (int count = 1; count <= num; count++){
            fact = fact*count;
        }
        System.out.println("The factorial of: "+num + " is " + fact);
    }
}
