import java.util.Scanner;

public class Question5 {
// A program to find area of circle,rectangle and triangle
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

        double c = (3.14)*r*r;
        double rec = l*b;
        double t = (b*h)/2;
        System.out.println("Area of circle is " + c + "\nArea of rectangle is " + rec + "\nArea of triangle is " + t);


    }
}
