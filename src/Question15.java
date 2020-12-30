import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ASCII code (between 0 - 128): ");
        int num = input.nextInt();
        System.out.println((char)num);
    }
}
