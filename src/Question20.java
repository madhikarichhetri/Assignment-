import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter second number: ");
        int n2 = input.nextInt();
        System.out.println("Enter operator: ");
        String operator = op.nextLine();
        if (operator == "+"){
            System.out.println("Addition: " + (n1+n2));
        }
        else if (operator == "-"){
            System.out.println("Subtract: " + (n1-n2));
        }
        else if (operator == "*"){
            System.out.println("Multiplication: " + (n1*n2));
        }
        else if(operator == "/"){
            System.out.println("Division: " + (n1/n2));
        }
    }
}
