import java.util.Scanner;

public class Question26 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits: ");
        String num = input.nextLine();
        int strLen = num.length();
        String num1 = "";
        for(int i=num.length()-1; i >= 0; i--){
            num1 = num1 + num.charAt(i);
        }
        System.out.println("Reverse: " + num1);
    }
}

