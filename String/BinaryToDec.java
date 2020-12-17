package String;

public class BinaryToDec {

    public static void main(String[] args) {

        // binary -> Decimal
        String binary = "1010110";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        // Octal -> Decimal
        String octalCo = "675";
        Integer decimalCo = Integer.parseInt(octalCo, 8);
        System.out.println(decimalCo);

        // hexadecimal -> Decimal
        String hexaDecimal = "F";
        Integer decimalToHex = Integer.parseInt(hexaDecimal, 16);
        System.out.println(decimalToHex);

    }

}
