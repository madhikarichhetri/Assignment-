/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2020
 */
//A program to trap the exception handling to trap the divided by zero and out of index value in array.
public class Question43 {
    double div(int x, int y) {

        double result = -1;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("arithemetic dive problemante");
            e.printStackTrace();
        }
        return result;
    }

    public int[] IndexValue(int[] array) {
        for (int i = 0; i <= array.length; i++)
            try {
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The index value in array is not valid");
            }
        return array;
    }


    public static void main(String[] args) {
        Question43 ree = new Question43();
        ree.div(2, 0);
    }
}