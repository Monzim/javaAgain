package Array;

public class ArrayColumnPlus {
    public static void main(String[] args) {

        int[][] arrayOne = new int[4][];
        int k = 0;

        arrayOne[0] = new int[1];
        arrayOne[1] = new int[2];
        arrayOne[2] = new int[3];
        arrayOne[3] = new int[4];

        // assigning value
        for (int row = 0; row < arrayOne.length; row++) {
            for (int column = 0; column < row + 1; column++) {
                arrayOne[row][column] = k;
                k++;
            }
        }

        // priting value
        for (int row = 0; row < arrayOne.length; row++) {
            for (int column = 0; column < row + 1; column++) {
                System.out.print(" " + arrayOne[row][column]);
            }
            System.out.println();
        }
    }

}
