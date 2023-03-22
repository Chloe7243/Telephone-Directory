import java.util.Scanner;
import java.io.*;

public class TelephoneDirectory {
    static Scanner input = new Scanner(System.in);
    static int option;
    static int n = 0;
    static String[][] directory = new String[100][3];
    static String fileName = "./directory.txt";

    TelephoneDirectory(){

        readFile();

        do {
            System.out.println("Enter an option:");
            System.out.println("1. Add a contact");
            System.out.println("2. Delete a contact");
            System.out.println("3. Retrieve a contact");
            System.out.println("4. Display contacts in a range");
            System.out.println("5. Display all contacts");
            System.out.println("6. Display contacts by first letter");
            System.out.println("7. Quit");

            option = input.nextInt();

            switch (option) {
                case 1 ->{
                    // add a contact
                        addContact();
                        System.out.println();
                }
                case 2 ->{
                    // delete a contact
                    delContact();
                    System.out.println();
                }
                case 3-> {
                    // retrieve a contact
                    retrieveContact();
                    System.out.println();
                }
                case 4 ->
                    // display contacts in a range
                    displayRange();
                case 5 ->
                    // display all contacts
                    displayAllContacts();
                case 6 ->
                    // display contacts by first letter
                    displayFirstLetter();
                case 7 ->
                    // quit
                        System.out.println("Goodbye.");
                default -> System.out.println("Invalid option.\n");
            }
        } while (option != 7);

        input.close();
    }

    static void readFile() {
        // read data from file if it exists
        try {
            File file = new File(fileName);
            if (file.exists()) {
                Scanner fileInput = new Scanner(file);
                while (fileInput.hasNextLine()) {
                    String line = fileInput.nextLine();
                    directory[n] = line.split(",");
                    n++;
                }
                fileInput.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }

    static void addContact() {
        // add a contact
        System.out.print("Enter name: ");
        String name = input.next();
        System.out.print("Enter age: ");
        String age = input.next();
        System.out.print("Enter contact number: ");
        String contact = input.next();
        directory[n][0] = name;
        directory[n][1] = age;
        directory[n][2] = contact;
        n++;

        // write data to file
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(name + "," + age + "," + contact + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    static void delContact() {
        // delete a contact
        System.out.print("Enter index of contact to delete: ");
        int index = input.nextInt();
        if (index >= 0 && index < n) {
                } else {
            System.out.println("Invalid index.");
        }
    }

    static void retrieveContact() {
        // retrieve a contact
        System.out.print("Enter index of contact to retrieve: ");
        int index = input.nextInt();
        if (index >= 0 && index < n) {
            System.out.println("Name: " + directory[index][0]);
            System.out.println("Age: " + directory[index][1]);
            System.out.println("Contact: " + directory[index][2]);
        } else {
            System.out.println("Invalid index.");
        }
    }

    static void displayRange() {
        // display contacts in a range
        System.out.print("Enter start index: ");
        int start = input.nextInt();
        System.out.print("Enter end index: ");
        int end = input.nextInt();
        if (start >= 0 && end >= start && end < n) {
            for (int i = start; i <= end; i++) {
                System.out.printf("Name:%s\n", directory[i][0]);
                System.out.printf("Age:%s\n", directory[i][1]);
                System.out.printf("Contact:%s\n\n", directory[i][2]);
            }
        } else {
            System.out.println("Invalid range.\n");
        }

    }

    static void displayAllContacts() {
        // display all contacts
        if(n == 0){
            System.out.println("You have no contacts yet.\n");
            return;
        }
        System.out.println("======= ALL CONTACTS ======");
        for (int i = 0; i < n; i++) {
            System.out.printf("Name: %s\n", directory[i][0]);
            System.out.printf("Age: %s\n", directory[i][1]);
            System.out.printf("Contact: %s\n\n", directory[i][2]);
        }
    }

    static void displayFirstLetter() {
        // display contacts by first letter
        System.out.print("Enter first letter: ");
        String letter = input.next();
        int none = 0;
        for (int i = 0; i < n; i++) {
            if (directory[i][0].toLowerCase().startsWith(letter.toLowerCase())) {
                System.out.printf("Name: %s\n", directory[i][0]);
                System.out.printf("Age: %s\n", directory[i][1]);
                System.out.printf("Contact: %s\n\n", directory[i][2]);
            }else {
                none += 1;
            }
        }
        if(none == n)
            System.out.printf("You have no contact that starts with %s\n\n", letter);
    }
}