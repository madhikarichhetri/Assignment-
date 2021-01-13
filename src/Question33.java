/**
 * Author: Mohan Adhikari Chhetri
 * Since: jan 2020
 */
// a Program to display numbers in ascending order in array.
public class Question33 {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 9, 4, 2, 6}; // taking input number in random orders.
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a : arr) {
            System.out.println(a);
        }

    }
}
