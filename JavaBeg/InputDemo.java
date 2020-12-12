package JavaBeg;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner yourNam = new Scanner(System.in);
        int numberA;
        int numberB;
        String youName;

        System.out.println("Enter your Name: ");
        youName = yourNam.next();

        System.out.print("Enter any Number here: ");
        numberA = input.nextInt();

        System.out.print("Enter Second Number here: ");
        numberB = input.nextInt();

        int sum = numberA + numberB;
        System.out.println(youName + " your Summation is : " + sum);

    }

}
