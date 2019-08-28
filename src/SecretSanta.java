import java.util.Random;
import java.util.Scanner;

public class SecretSanta {
    public static final int Country =2;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner console = new Scanner(System.in);
        printlnTheConsole("LETS FIND SECRET SANTA");
        FamilyMembers[] familyMembers = createParticipants(console);
        String Choice;
        do{
            printlnTheConsole("MAIN MENU");
            System.out.println("Enter A : Create new familyMembers List.");
            System.out.println("Enter B : List the names of all familyMembers.");
            System.out.println("Enter C : Pair creation for the familyMembers.");
            System.out.println("Enter D : View all the pairing of familyMembers.");
            System.out.println("Enter E : Save familyMembers list and their pairing to a file.");
            System.out.println("Enter Q : Quit.");
            choice = console.nextLine();
            if (choice.equalsIgnoreCase("A")){
                familyMembers = createParticipants(console);
            }else if (choice.equalsIgnoreCase("B")){
                ListParticipants(familyMembers);
            }else if (choice.equalsIgnoreCase("C")){
                assigneRecipients(familyMembers);
            }else if (choice.equalsIgnoreCase("D")){
                printAll(familyMembers);
            }else if (choice.equalsIgnoreCase("E")){
                saveAll(familyMembers);
            }
            System.out.println();
        }while (choice.equalsIgnoreCase("Q"));
    }

    public static void printlnTheConsole(String text) {
        System.out.println("***" + text + "***");

    }
    public static <Scannerconsole> FamilyMembers[] createParticipants(Scannerconsole){
        System.out.println();
        printlnTheConsole("Create Your Participants List");
        System.out.println();
        printlnTheConsole("Enter The Desire Name Of The FamilyMembers ");
        System.out.println();
    }
}
