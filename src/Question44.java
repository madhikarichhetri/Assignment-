
//A program to store the name and address of 10 students in file and search address by given name.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question44 {
    public static void main(String[] args) {

        Map<String, String> studentInfo = new HashMap<>();

        //Taking Data of 10 student

        studentInfo.put("David", "Irving,TX");
        studentInfo.put("Tim", "Houston,TX");
        studentInfo.put("Cook", "Daran,Nepal");
        studentInfo.put("Ram", "Chitwan,Nepal");
        studentInfo.put("Hari", "kathmandu,Nepal");
        studentInfo.put("Johnny", "Dallas,Nepal");
        studentInfo.put("Sam", "Colony,TX");
        studentInfo.put("kathy", "NewYork,NY");
        studentInfo.put("Nancy", "Ada,Ok");
        studentInfo.put("Nisha", "Butwal,Nepal");

        boolean result = writeToFile(studentInfo);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name of Student: ");
        String name = input.nextLine();
        System.out.print("You have entered: " + name);

        System.out.println("The address of given student is: " + studentInfo.get(name));

    }

    private static boolean writeToFile(Map<String, String> studentInfo) {

        try (BufferedWriter br = new BufferedWriter(new FileWriter("output.txt", true)))
        {

            for (Map.Entry<String, String> entry : studentInfo.entrySet()) {
                String content = entry.getKey() + "\t" + entry.getValue() + "\n";
                br.write(content);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }



}
