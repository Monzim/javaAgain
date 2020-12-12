package JavaBeg;

import java.util.Scanner;

public class TharmomiterScale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius, fahrenheit;

        // celsius to fahrenheit
        System.out.print("Input celsius tempurator: ");
        celsius = input.nextDouble();

        fahrenheit = celsius * 1.8 + 32;
        System.out.println("Tempurator: " + fahrenheit + " F");

        // fahrenheit to celsius
        System.out.print("Input fahrenheit tempurator: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 0.555555555556;
        System.out.println("Tempurator: " + celsius + " C");

    }

}
