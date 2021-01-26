/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2021
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

class Question45 {

    public static void main(String[] args){
        String line;
        String word = null;
        int count = 0;
        int maxCount = 0;

        ArrayList<String> words = new ArrayList<String>();

        String filepath = "C:/Users/adhik/OneDrive/Desktop/sam.txt";
        try {
            FileReader file = new FileReader(filepath);
            BufferedReader name = new BufferedReader(file);

            while ((line = name.readLine()) != null) {
                String string[] = line.toLowerCase().split("([,.\\s]+)");

                for (String s : string) {
                    words.add(s);
                }
            }

            for (int i = 0; i < words.size(); i++) {
                count = 1;

                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(i).equals(words.get(j))) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    word = words.get(i);
                }
            }

            System.out.println("The most repeated word is: " + word);
            name.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


