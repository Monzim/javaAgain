package Array;

public class ArrayNumb {
    public static void main(String[] args) {

        int[][] array = new int[4][5];
        int numb = 0;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < 5; column++) {
                array[row][column] = numb;
                numb++;

            }
        }
        // printing array
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.print(" " + array[row][column]);
            }
            System.out.println();
        }
    }

}
