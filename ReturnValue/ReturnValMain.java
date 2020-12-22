package ReturnValue;

import java.util.Scanner;

public class ReturnValMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number for see its square: ");
        int number = input.nextInt();

        ReturningVal squareOfNum = new ReturningVal();
        int output = squareOfNum.square(number);
        System.out.println("Square of input: " + output);
    }

}
