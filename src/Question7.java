import java.util.Scanner;

public class Question7 {

        //a program that reads the radius and length of a cylinder and computes volume.
        public static void main(String[] args){
            int r; //radius of cylinder
            int l; // length of cylinder

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the radius: ");
            r = input.nextInt();
            System.out.print("Enter the length: ");
            l = input.nextInt();

            double vol = 3.14*r*r*l;
            System.out.println("Volume of Cylinder is " + vol );

    }

}
