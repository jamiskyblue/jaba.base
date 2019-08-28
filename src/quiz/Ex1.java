package quiz;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList studentList = new ArrayList();
        HashSet subjectList  = new HashSet();
        System.out.println("how many students do you want to calculate?");
        int count = scanner.nextInt();

        for(int i = 0; i<count; i++){
            ArrayList markList = new ArrayList();
            System.out.println("Insert students name :");
            String student = scanner.next()
        }
    }
}
