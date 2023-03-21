import java.util.Scanner;

public class Matrix {
    Matrix() {
        int A1, A2, A3, A4, B1, B2, B3, B4;
        System.out.println("========== Calculating multiplication of a 2 by 2 matrix==========");
        System.out.println("Input your values based on this format:\n|A1 A2|   |B1 B2|\n|A3 A4| * |B3 B4|\n");

//        GETS MATRIX INPUT
        A1 = getValue("A1");
        A2 = getValue("A2");
        A3 = getValue("A3");
        A4 = getValue("A4");
        B1 = getValue("B1");
        B2 = getValue("B2");
        B3 = getValue("B3");
        B4 = getValue("B4");

//        CALCULATES PRODUCT
        int C1 = (A1 * B1) + (A2 * B3);
        int C2 = (A1 * B2) + (A2 * B4);

        int C3 = (A3 * B1) + (A4 * B3);
        int C4 = (A3 * B2) + (A4 * B4);

//        PRINTS PRODUCT VALUE
        System.out.println(String.format("Product is:\n| %d   %d|\n|%d %d|/n", C1, C2, C3, C4));
    }
    public static int getValue(String val) {
        Scanner read = new Scanner(System.in);
        System.out.print(String.format("Value of %s:", val));
        return read.nextInt();
    }
}
