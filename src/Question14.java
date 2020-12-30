import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter second number: ");
        int n2 = input.nextInt();
        if (n1>n2){
            System.out.println("First num > Second num");
        }
        else if (n1<n2){
            System.out.println("First num < Second num");
        }
        else if (n1 == n2){
            System.out.println("First num = Second num");
        }
    }
}
