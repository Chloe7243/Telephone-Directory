import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ASKS USER FOR NAME
        Scanner read = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = read.nextLine();

//        ASKS USER FOR ACTIVITY TO BE DONE
        System.out.printf("Hey %s, what would you like to do today%n", name);
        System.out.println("1. Telephone Directory");
        System.out.println("2. Multiply 2 by 2 matrices");
        System.out.println("3. Quit");

//        GETS USERS CHOICE
        System.out.print("Choice: ");
        int choice = read.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println();
                System.out.println("Telephone Directory");
                //noinspection InstantiationOfUtilityClass
                new TelephoneDirectory();
            }
            case 2 -> {
                System.out.println();
                System.out.println("Multiply 2 by 2 matrices");
                //noinspection InstantiationOfUtilityClass
                new Matrix();
            }
            case 3 ->
                // quit
                    System.out.println("Goodbye.");
            default -> System.out.println("Invalid Option");
        }

    }
}
