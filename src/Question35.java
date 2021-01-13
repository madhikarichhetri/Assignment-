
import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2021
 **/
public class Question35 {
    public static int[] takeInputInArray(Scanner input) {
        System.out.println("Enter size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void findSecondLargestElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr =Question35.takeInputInArray(input);

        Question35.findSecondLargestElement(arr);


    }
}
