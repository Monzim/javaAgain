package ForLoop;

import java.util.Scanner;

public class PrintingPrimeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;
        int c = 0;

        System.out.print("Enter 1st number: ");
        a = input.nextInt();
        System.out.print("Enter Last number: ");
        b = input.nextInt();

        for (int i = a; i <= b; i++) {

            for (int t = 2; t < i; t++) {

                if (i % t == 0) {
                    c++;
                    break;

                }

            }
            if (c == 0)
                System.out.println(i);
            c = 0;

        }

    }

}
