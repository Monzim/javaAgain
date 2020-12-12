package JavaBeg;

import java.util.Scanner;

public class CapitalSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char wd;

        System.out.print("Input a Charecter: ");
        wd = input.next().charAt(0);
        if (wd >= 'a' && wd <= 'z') // a-z
        {
            System.out.println("Small Letter");
        } else if (wd >= 'A' && wd <= 'Z') {
            System.out.println("Capital Lettter");
        } else {
            System.out.println("Not a letter");
        }

    }

}
