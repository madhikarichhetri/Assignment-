import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2020
 */
//A program to reverse the string.
public class Question40 {

    static String reverse(String s) {
        String nam = "";
        for (int j = s.length(); j > 0; --j) {
            nam = nam + (s.charAt(j - 1));
        }
        return nam;
    }

    public static void main(String[] arg) {
        Question40 nam = new Question40();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String name: ");
        String name = input.nextLine();
        System.out.println("Reverse of a String  is : " + nam.reverse(name));
    }


}



