package ForLoop;

import java.util.Scanner;

public class FactorialBeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numb, fact = 1;
      
        System.out.print("Enter any positive number: ");
        numb = input.nextInt();

        for (int i = numb; i >= 1; i--) {

            fact = fact * i;
        }
        System.out.println("Factorial of " + numb + " = " + fact);

    }

}
