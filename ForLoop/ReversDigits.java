package ForLoop;

import java.util.Scanner;

public class ReversDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0, r, temp, numb;

        System.out.print("Input a number: ");
        numb = input.nextInt();

        temp = numb;

        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp /= 10;
        }

        System.out.print("Reverse: " + sum);
        System.out.println(" ");

        if (sum == numb) {
            System.out.println("Palindrome  Number.");
        } else {
            System.out.println("Not a Palindrome Number.");
        }
    }

}
