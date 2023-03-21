import java.util.Scanner;

public class TelDirUI {
    public static void Menu(){

//        ASKS USER FOR ACTIVITY TO BE DONE
        Scanner read = new Scanner(System.in);
        System.out.println("========== What Would You Like To Do Today ==========");
        System.out.println("1. View Address Book");
        System.out.println("2. Add Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Search Contact");
        System.out.println("5. Display range of contact");

//        GETS USERS CHOICE
        System.out.print("Choice: ");
        int option = read.nextInt();

//        PERFORMS METHOD BASED ON USERS CHOICE
        switch (option){
            case 1:
                TelDir.viewAddressBook();
                break;
            case 2:
                TelDir.addContact();
                break;
            case 3:
                TelDir.delContact();
                break;
            case 4:
                TelDir.searchContact();
                break;
            case 5:
                TelDir.displayRangeContact();
                break;
            default:
                System.out.println("========== Invalid Option ==========");
                Menu();
        }
    }
}
