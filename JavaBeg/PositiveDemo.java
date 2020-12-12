package JavaBeg;

import java.util.Scanner;

public class PositiveDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a Number: ");
        num = input.nextInt();
        if (num > 0) {
            System.out.println("Your number is Positive");
        } else if (num < 0) {
            System.out.println("Your Number is Negative");
        } else {
            System.out.println("Equal to 0");
        }

    }

}
