package Array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] number = { 1, 55, 61, 878, 22, 241 };
        String[] name = { "azraf", "monzim", "monir", "shafiul", "opu", "rashed" };

        Arrays.sort(number);
        Arrays.sort(name);

        // printing number Assending
        System.out.print("Assending: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(" " + number[i]);
        }

        System.out.println();

        // printing number Desending
        System.out.print("Desending: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(" " + number[i]);
        }

        System.out.println("\n");

        // printing names Assending
        System.out.print("Assending Names: ");
        for (int i = 0; i < name.length; i++) {
            System.out.print(" " + name[i]);
        }
        System.out.println();

        // printing names Desending
        System.out.print("Desinding Names: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(" " + name[i]);
        }

    }

}
