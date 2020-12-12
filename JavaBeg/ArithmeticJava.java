package JavaBeg;

import java.util.Scanner;

public class ArithmeticJava {
    public static void main(String[] args) {

        Scanner inputYourNumb = new Scanner(System.in);
        int numb1, numb2, result;

        System.out.print("Enter your Numbers = ");
        numb1 = inputYourNumb.nextInt();

        System.out.print("Enter your Numbers = ");
        numb2 = inputYourNumb.nextInt();

        result = numb1 + numb2;
        System.out.println("Summation = " + result);

        result = numb1 - numb2;
        System.out.println("Subdivision = " + result);

        result = numb1 * numb2;
        System.out.println("Multiplication = " + result);

        double result2 = (double) numb1 / numb2;
        System.out.println("Division = " + result2);

        result = numb1 % numb2;
        System.out.println("Reminder = " + result);

    }
}
