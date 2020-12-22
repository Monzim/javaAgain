package Example;

import java.util.Scanner;

public class ReveringInterger {

    public static void main(String[] args) {

        // 12535 -> 53521 reversing numbers
        System.out.println(
                "\n\t\t*****************************\n \t\t\tReveringInterger \n\t\t*****************************");

        Scanner input = new Scanner(System.in);

        int number, temp, reminder;
        String sum;

        System.out.print("Input a Number: ");
        number = input.nextInt();

        temp = number;
        sum = "";

        while (temp != 0) {
            reminder = temp % 10;
            sum += reminder;
            temp /= 10;
        }
        System.out.println("Reverse: " + sum);
    }

}
