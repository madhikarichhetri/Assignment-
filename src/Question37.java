/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2021
 */
//doing addition in 2D array
public class Question37 {

    public static void main(String[] args) {
        //Inputing elements in two dimensions array.
        int[][] a = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] b = {{4,5,6},{2,7,8},{3,1,9}};
      //calculations
        int sum[][] = new int[3][3];
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){

                sum[i][j]= a[i][j]+ b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println( );
        }

    }
}
