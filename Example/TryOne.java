package Example;

import java.util.Date;
import java.util.Scanner;

public class TryOne {
    public static void main(String[] args) {

        // get a input of interger number and output as binary oct and hex

        Scanner inputNumb = new Scanner(System.in);
        Date date = new Date();

        System.out.print("Enter your number: ");
        int number = inputNumb.nextInt();

        String binary, octal, hexadecimal;

        binary = Integer.toBinaryString(number);
        octal = Integer.toOctalString(number);
        hexadecimal = Integer.toHexString(number);

        System.out
                .println(" Binary: " + binary + "\n Octal: " + octal + "\n HexaDecimal: " + hexadecimal + "\n" + date);

    }

}
