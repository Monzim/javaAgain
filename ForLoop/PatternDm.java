package ForLoop;

import java.util.Scanner;

public class PatternDm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter line Number: ");
        num = input.nextInt();

        for (int row = num; row >= 1; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" " + column);
            }
            System.out.println();

        }

    }

}
