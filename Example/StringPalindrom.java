package Example;

import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        // Palindrome Number
        // 121 reverse it 121 same
        // "Anna" reverse "Anna" same
        // "tattarrattat"
        System.out.println(
                "\n\t\t*****************************\n \t\t\tStringPalindrom\n\t\t*****************************");

        Scanner input = new Scanner(System.in);

        String userInput, reverse;

        System.out.print("Input a String or interger to see Palindrome: ");

        userInput = input.nextLine();

        StringBuilder tempString = new StringBuilder(userInput);
        reverse = tempString.reverse().toString();

        if (userInput.equals(reverse)) {
            System.out.println("String Palindrom");
        } else {
            System.out.println("Not String Palindrom");

        }
    }
}
