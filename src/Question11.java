public class Question11 {
    public static void main(String[] args) {

        // (a)
        int a = 4;
        int b = 6;
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a: " + a);
        System.out.println( "b: " + b);

        //b
        int a1 = 4;
        int b1 = 6;
        a1 = a1+b1;
        b1 = a1-b1;
        a1 = a1-b1;
        System.out.println("a1: " + a1);
        System.out.println( "b1: " + b1);

    }


}
