package JavaBeg;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numb1, numb2, large;

        System.out.println("Enter two numbers");
        numb1 = input.nextInt();
        numb2 = input.nextInt();

        large = (numb1 > numb2) ? numb1 : numb2;
        System.out.println("Large Number = " + large);
    }

}
