package ForLoop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int reminder, num, temp;
        System.out.print("Input numbers: ");
        num = input.nextInt();
        temp = num;

        while (temp != 0) {
            reminder = temp % 10;
            sum = sum + Math.pow(reminder, 3);
            temp /= 10;

        }
        System.out.print("");
        System.out.println("Summation: " + sum);
        if (num == sum) {

            System.out.println("Its a Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }

}
