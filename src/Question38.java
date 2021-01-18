import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2021
 */
//A program to check whether a given string is palindrome or not.

public class Question38 {
    static boolean isPalindrome(String name) {
        int i = 0, j = name.length() - 1;
        while (i < j) {

            if (name.charAt(i) != name.charAt(j))
                return false;
            i++;  //increments
            j--;
        }
        return true;
    }

    // Driver code
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name to check palindrome: ");
        String name = input.nextLine();

        if (isPalindrome(name))
            System.out.print("Yes, it is palindrome.");
        else
            System.out.print("No, it is not a palindrome.");
    }
}

