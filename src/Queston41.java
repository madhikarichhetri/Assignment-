import java.util.Scanner;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2021
 */
//A program to find the duplicate letter in a word.
public class Queston41 {
    public String dublicateLetter(String word) {
        char[] str = word.toCharArray();
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    System.out.println(str[j]);
                }
            }
        }
        return word;
    }
    public static void main(String[] args) {
        Queston41 s1 = new Queston41();
        s1.dublicateLetter("");


    }
}
