package Array;

import java.util.Scanner;

public class MatrixCross {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int diagonal = 0;
        int upperTriangle = 0;
        int lowerTriangle = 0;

        int[][] A = new int[3][3];

        // getting input A matrix
        System.out.println("Input numbers: ");
        for (int row = 0; row < A.length; row++) {
            for (int column = 0; column < A.length; column++) {
                System.out.printf("A [%d] [%d] = ", row, column);
                A[row][column] = input.nextInt();
            }

        }
        System.out.println("");

        // printing A matrix
        System.out.println("A Matrix = \n");
        for (int row = 0; row < A.length; row++) {
            for (int column = 0; column < A.length; column++) {
                System.out.print(" " + A[row][column]);
            }
            System.out.println();
        }

        for (int row = 0; row < A.length; row++) {
            for (int column = 0; column < A.length; column++) {
                if (row == column) {
                    diagonal = diagonal + A[row][column];
                }
                if (row < column) {
                    upperTriangle = upperTriangle + A[row][column];
                }
                if (row > column) {
                    lowerTriangle = lowerTriangle + A[row][column];
                }
            }
        }

        System.out.println("Diagonal: " + diagonal);
        System.out.println("UpperTriangle: " + upperTriangle);
        System.out.println("LowerTriangle: " + lowerTriangle);

    }

}
