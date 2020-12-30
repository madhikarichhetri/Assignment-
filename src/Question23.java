import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int  sum = 0;
        for (int count=1; count<=num; count++ ){
            sum += count;
        }
        System.out.println("The sum of "+num+" natural number is: "+ sum);
    }
}
