import java.util.Scanner;
public class Question10 {

    static public float s(int u, int t, int a){
        return (float) (u*t + 0.5*a*t*t);
    }

    static public float area(int s, int a, int b, int c){

        return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    static public float x(int a, int b, int c){

        return (float) ((-b)+Math.sqrt((b*b)-4*a*c))/2*a;
    }
    public static void main(String[] args) {

        Scanner Scn = new Scanner(System.in);
        System.out.print("Enter s: ");
        int s = Scn.nextInt();
        System.out.print("Enter u: ");
        int u = Scn.nextInt();
        System.out.print("Enter t: ");
        int t = Scn.nextInt();
        System.out.print("Enter a: ");
        int a = Scn.nextInt();
        System.out.print("Enter b: ");
        int b = Scn.nextInt();
        System.out.print("Enter c: ");
        int c = Scn.nextInt();

        System.out.println("Output:");
        System.out.println("--------");
        System.out.println("s: "+ s(u,t,a));
        System.out.println("Area: " + area(s,a,b,c));
        System.out.println("X: " + x(a,b,c));


    }
}
