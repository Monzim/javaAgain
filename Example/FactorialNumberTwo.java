package Example;

import java.util.Scanner;

public class FactorialNumberTwo {
    public static void main(String[] args) {

        // factorial number
        // In mathematics, the factorial of a positive integer n,
        // denoted by n!, is the product of all positive integers less than or equal to
        // n: For example, The value of 0! is 1, according to the convention for an
        // empty product.
        // n! = n * (n -1) * ......
        // must be positive number

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int num = input.nextInt();
        long sum = 1;
        for (int i = num; i >= 1; i--) {
            sum *= i;
        }
        System.out.println("Factorial of " + num + " :" + sum);
    }

}
