package ForLoop;

import java.util.Scanner;

public class NumberSideSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int in, temp, r;
        System.out.print("Input numbers: ");
        in = input.nextInt();

        temp = in;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("Summation of digits: " + sum);

    }

}
