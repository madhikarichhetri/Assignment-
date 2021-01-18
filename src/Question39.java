import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2021
 */
//a Program to display names in short form.
public class Question39 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Full name of the person: ");
        String name = input.nextLine();
        // creating space
        name = " " + name;
        int last = name.lastIndexOf(' ');
        for (int i = 0; i < last; i++) {
            if (name.charAt(i) == ' ')
                System.out.print(name.charAt(i + 1) + ".");
        }
        System.out.println(name.substring(last));

    }

}
