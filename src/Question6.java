import java.util.Scanner;

public class Question6 {

        // A program to find perimeter of circle,rectangle and triangle
        public static void main(String[] args){
            int r; //radius
            int l; // length
            int b; //base
            int h; // height


            Scanner input = new Scanner(System.in);
            System.out.print("Enter the radius: ");
            r = input.nextInt();
            System.out.print("Enter the length: ");
            l = input.nextInt();
            System.out.print("Enter the base: ");
            b = input.nextInt();
            System.out.print("Enter the height: ");
            h = input.nextInt();

            double c = 2*3.14*r;    //pi = 3.14
            double rec = 2*l + 2*b;
            double t = l+b+h;
            System.out.println("Perimeter of circle is " + c + "\nPerimeter of rectangle is " + rec + "\nPerimeter of triangle is " + t);


        }
    }


