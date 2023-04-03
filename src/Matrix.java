import java.util.Scanner;

public class Matrix {
    Matrix() {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];
        System.out.println("========== Calculating multiplication of a 2 by 2 matrices ==========");
        System.out.println("Input your values based on this format:\n|A1 A2|   |B1 B2|\n|A3 A4| * |B3 B4|\n");


//        GETS VALUES FOR MATRIX

         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int currVal = i + j + (i == 1 ? 2 : 1);
                System.out.print(i);
                System.out.println(j);
                matrix1[i][j] = getValue(String.format("A%d",(currVal)));
                matrix2[i][j] = getValue(String.format("B%d",(currVal)));
                System.out.print("\n");
            }
        }

//        CALCULATES PRODUCT
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

//        PRINTS PRODUCT VALUE
        System.out.println("Result of product is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int getValue(String val) {
        Scanner read = new Scanner(System.in);
        System.out.printf("Value of %s:", val);
        return read.nextInt();
    }
}
