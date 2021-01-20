/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2020
 */
public class Question42 {
    public static void main(String[] args) {

    String string = "You can get as many as candy you want";
    int count;
    string = string.toLowerCase();
    String words[] = string.split(" ");

        System.out.println("The duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
        count = 1;
        for(int j = i+1; j < words.length; j++) {
            if(words[i].equals(words[j])) {
                count++;
                words[j] = "0";
            }
        }
        if(count > 1 && words[i] != "0")
            System.out.println(words[i]);
    }
}
}

