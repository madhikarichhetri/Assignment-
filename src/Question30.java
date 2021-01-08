/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2020
 */
//Fibonacci series. 1 1 2 3 5 8 ….
public class Question30 {
    public static void main(String[] args) {
        int f = 0;
        int a =1;
        int b=1;
        System.out.print("1 1 ");
        while (f<=7){
            f =  a+b;
            System.out.print(f + " ");
            a = b;
            b = f;

        }

    }
}
