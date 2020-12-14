package Array;

import java.util.Scanner;

public class MatrixArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int[][] c = new int[2][3];

        // input in a matrix
        System.out.println("Enter elements for 'a' matrix ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.printf("A [%d] [%d] = ", row, column);
                a[row][column] = input.nextInt();
            }
        }

        // input in b matrix
        System.out.println("Enter elements for 'b' matrix ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.printf("B [%d] [%d] = ", row, column);
                b[row][column] = input.nextInt();
            }
        }
        System.out.print("\n");

        // printing in a matrix
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("\t" + a[row][column]);
            }
            System.out.println();
        }
        System.out.print("\n\n");

        // printing in b matrix
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("\t" + b[row][column]);
            }
            System.out.println();
        }
        System.out.println();
        // adding a and b matrix
        System.out.print("Sum is (A+B) = ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                // System.out.print("\t " + a[row][column] + b[row][column]);
                c[row][column] = a[row][column] + b[row][column];
                System.out.print("\t" + c[row][column]);
            }
            System.out.print("\n\n");

        }

    }

}
