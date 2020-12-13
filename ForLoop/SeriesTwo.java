package ForLoop;

import java.util.Scanner;

public class SeriesTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        double fact = 1;

        System.out.print("Input last number: ");
        n = input.nextInt();

        for (double i = 1.5; i <= n; i = i + 1) {

            {

                fact = fact * i;
                System.out.println(i + " " + " * " + i + " =  " + fact + "   ");
                // System.out.println(n + " x " + n + " = " + fact);
                // System.out.println(i + " " + "fact: " + fact);

            }

            // System.out.println(fact);
        }

    }

}
