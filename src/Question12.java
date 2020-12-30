import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll: ");
        String roll = input.nextLine();
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter nationality: ");
        String nation = input.nextLine();

        System.out.println("Roll No: " + roll + ", Name: " + name + ", Nationality: " + nation);


    }

}
