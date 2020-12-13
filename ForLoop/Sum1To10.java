package ForLoop;

import java.util.Scanner;

public class Sum1To10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;
        int sum = 0;

        System.out.print("Enter the start number: ");
        a = input.nextInt();

        System.out.print("Enter the Last number: ");
        b = input.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.print(" " + i);
            }
        }
        {
            System.out.println();
            System.out.println("The Summation is: " + sum);
        }
    }

}
