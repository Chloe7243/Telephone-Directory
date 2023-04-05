import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ASKS USER FOR NAME
        Scanner read = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = read.nextLine();

//        ASKS USER FOR ACTIVITY TO BE DONE
        System.out.printf("Hey %s, what would you like to do today%n", name);
        //noinspection InstantiationOfUtilityClass
        new TelephoneDirectory();



    }
}
