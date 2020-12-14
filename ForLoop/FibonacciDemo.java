package ForLoop;

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = 0;
        int second = 1;
        int febo;

        System.out.print("How many numbers wants to see: ");
        int n = input.nextInt();
        System.out.print(first + " " + second);

        for (int i = 3; i <= n; i++) {
            febo = first + second;
            System.out.print(" " + febo);

            first = second;
            second = febo;
        }
    }

}
