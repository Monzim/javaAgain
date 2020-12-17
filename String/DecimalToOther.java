package String;

import java.util.Scanner;

public class DecimalToOther {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Decimal -> binary
        int num = 10;
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);

        // Decimal -> Octal
        int num2 = 225;
        String octal = Integer.toOctalString(num2);
        System.out.println(octal);

        // Decimal -> HexaDecimal
        int num3 = 1555;
        String hexaDec = Integer.toHexString(num3);
        System.out.println(hexaDec.toUpperCase());

        int number;
        String hexaDecimalTo, binaryTo, octaneTo;

        System.out.print("Input your decimal number: ");
        number = input.nextInt();

        binaryTo = Integer.toBinaryString(number);
        octaneTo = Integer.toOctalString(number);
        hexaDecimalTo = Integer.toHexString(number);

        System.out.println("Binary: " + binaryTo);
        System.out.println("Octane: " + octaneTo);
        System.out.println("HexaDe: " + hexaDecimalTo.toUpperCase());

    }

}
