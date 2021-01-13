/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2021
 */
//a program to reverse the element of an array.
public class Question34 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        System.out.println("The elements of an array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The elements of array in reverse order:");
        // reversing the given element.
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }


    }
}
