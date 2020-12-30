import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int n1 = input.nextInt();
        System.out.println("Enter num2: ");
        int n2 = input.nextInt();
        System.out.println("Enter num3: ");
        int n3 = input.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " is the largest among three.");
        }
        else if (n2 > n1 && n2 > n3){
            System.out.println(n2 + " is the largest among three.");
        }
        else{
            System.out.println(n3 + " is the largest among three.");
        }
    }
}
