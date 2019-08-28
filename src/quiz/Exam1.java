package quiz;
import java.util.Scanner;

public class Exam1 {

    private static Scanner sc;

    public static void main(String[] args) {
        String name;
        int english, computers, physics, maths;
        sc = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME");
        name = sc.nextLine();
        System.out.print(" Please Enter the 4 Subjects Marks : ");
        english = sc.nextInt();
        computers = sc.nextInt();
        physics = sc.nextInt();
        maths = sc.nextInt();

        totalmarks(english, computers, physics, maths);
    }

    public static void totalmarks(int eng, int com, int phy, int math) {
        float total, Percentage, Average;
        total = eng + com + phy + math;
        Average = total / 4;

        System.out.println(" Total Marks =  " + total);
        System.out.println(" Average Marks =  " + Average);
    }
}


