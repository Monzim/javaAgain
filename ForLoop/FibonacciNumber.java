package ForLoop;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        // Fibonacci number 0 1 2 3 5 8 13 ......
        // 1st + 2nd = 3rd
        // In mathematics, the Fibonacci numbers, commonly denoted Fₙ, form a sequence,
        // called the Fibonacci sequence, such that each number is the sum of the two
        // preceding ones, starting from 0 and 1. That is, and for n > 1.

        Scanner input = new Scanner(System.in);

        System.out.print("Input the last Fibonacci Digit: ");
        int endNum = input.nextInt();

        long factorial, firstNum, secondNum, thirdNum;

        firstNum = 1;
        secondNum = 2;

        System.out.print("\n0 \n1 \n1 \n2 \n");
        for (int i = endNum; i > 0; i--) {
            thirdNum = firstNum + secondNum;
            System.out.println(thirdNum + " ");
            firstNum = secondNum;
            secondNum = thirdNum;
        }

    }

}
