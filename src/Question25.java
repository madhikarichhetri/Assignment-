import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
       List NameList = new ArrayList();
       List ScoreList = new ArrayList();

        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int num = input.nextInt();

        while (num >= 1){
            System.out.println("Enter student's name: ");
            String name = str.nextLine();
            NameList.add(name);
            System.out.println("Enter score: ");
            String score = str.nextLine();
            ScoreList.add(score);
            num --;
        }
        System.out.println("Student name: " + NameList.get(ScoreList.indexOf(Collections.max(ScoreList))));
        System.out.println("Highest score: " + Collections.max(ScoreList));
    }
}
