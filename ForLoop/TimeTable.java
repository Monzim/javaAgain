package ForLoop;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fact, a, b;

        System.out.print("Enter 1st Number: ");
        a = input.nextInt();

        System.out.print("Enter Last Number: ");
        b = input.nextInt();

        for (int z = a; z <= b; z++) {

            for (int i = 1; i <= 10; i++) {

                fact = z * i;
                System.out.println(z + " x " + i + " = " + fact);
            }
            System.out.println("\n");
        }

    }

}
