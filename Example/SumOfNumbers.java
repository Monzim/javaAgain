package Example;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Happy New Year 🎉🎉🎉
        System.out.println(
                "\n\t\t*****************************\n \t\t\tEven and Odd \n\t\t*****************************");

        Scanner input = new Scanner(System.in);

        int firstNum, lastNum, sumOfOdd, sumOfEven;
        sumOfEven = 0;
        sumOfOdd = 0;

        System.out.print("Enter First Number: ");
        firstNum = input.nextInt();

        System.out.print("Enter Last Number: ");
        lastNum = input.nextInt();

        System.out.print("\nOdd Numbers: ");

        for (int j = firstNum; j <= lastNum; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
                sumOfOdd += j;
            }
        }

        System.out.print("\n\nEven Numbers: ");

        for (int j = firstNum; j <= lastNum; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
                sumOfEven += j;

            }
        }
        System.out.println("\n\nsumOfOdd: " + sumOfOdd + "\nsumOfEven: " + sumOfEven + "\n");
    }
}