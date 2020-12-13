package ForLoop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, b = 0, c;
        System.out.print("Enter any positive number: ");

        num = input.nextInt();

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                b++;
                break;
            }

        }
        if (b == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }

}
