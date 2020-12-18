package Example;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        // Palindrome Number
        // 121 reverse it 121 same
        // "Anna" reverse "Anna" same

        Scanner userInput = new Scanner(System.in);

        int number, tempString, reminder;
        String sum = "";

        number = userInput.nextInt();
        tempString = number;

        while (tempString != 0) {
            reminder = tempString % 10;
            sum += reminder;
            tempString /= 10;
        }
        if (Integer.valueOf(sum) == number) {
            System.out.println("Palindrome Number");
        } else {

            System.out.println("Not Palindrome Number");
        }
    }

}
