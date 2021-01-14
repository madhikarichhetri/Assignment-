/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2020
 *
 **/
//a function to find duplicate elements in an array.

public class Question36 {
    public static void main(String[] args) {
        int []arr = {1,3,4,3,5,6,4};
        for(int i = 0; i<arr.length-1;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The dublicate element is: "+ arr[j]);
                }
            }
        }

    }


}
