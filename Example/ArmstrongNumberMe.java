package Example;

import java.util.Scanner;

public class ArmstrongNumberMe {

    public static void main(String[] args) {
        /*
         * Armstrong number that kin d of number thats individual digit cube Sums equals
         * // to the dumber 153 = 1^3 + 5^3 + 3^3 = 153
         * 
         * 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
         * 
         * 1. input number store in temp 2. convert to individual number
         * 
         * 3. cube the num 4. sum the num 5. condision
         */

        Scanner input = new Scanner(System.in);

        int number, temp, remminder;
        double sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        temp = number;

        while (temp != 0) {
            remminder = temp % 10;
            sum += Math.pow(remminder, 3);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");

        }

    }

}
