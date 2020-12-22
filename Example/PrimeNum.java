package Example;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        // A prime number is a natural number greater than 1 that is not a product of
        // 10006721, 33489857205
        // two smaller natural numbers. A natural number greater than 1 that is not
        // prime is called a composite number.
        System.out
                .println("\t\t*****************************\n \t\t\tPrime NUmber \n\t\t*****************************");

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number: ");

        long num, store;
        store = 0;
        num = input.nextLong();

        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                store++;
                break;
            }
        }
        if (store == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");

        }

    }

}
