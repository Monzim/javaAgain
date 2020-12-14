package Array;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(20);
        number.add(-50);
        number.add(55);
        number.add(10);
        number.add(44);
        number.add(30);
        number.add(-30);

        System.out.println("Before sorting: " + number);

        // assending
        Collections.sort(number);
        System.out.println("After sorting in Assend: " + number);

        // desending
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After sorting in Desend: " + number);

    }

}
