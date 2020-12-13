package ForLoop;

import java.util.Scanner;

public class SeriesONe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        long sum = 0;
        long alp;

        System.out.print("Enter the Last Number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i = i + 1) {

            alp = i * i;
            sum = sum + alp;
            System.out.println(i + " x " + i + " = " + alp + " ");

        }

        System.out.println();
        System.out.print("Summation: " + sum);

    }

}
