package Array;

public class MutltiDiArray {
    public static void main(String[] args) {

        int[][] number = new int[2][3];

        number[0][0] = 10;
        number[0][1] = 50;
        number[0][2] = 60;
        number[1][0] = 70;
        number[1][1] = 40;
        number[1][2] = 20;

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(" " + number[row][column]);
            }
            System.out.println();
        }

    }

}
