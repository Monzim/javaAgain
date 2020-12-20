package Array;

import java.util.ArrayList;

public class ArrayListDm {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = " + number.size());

        // adding Elements
        number.add(10);
        number.add(20);
        number.add(40);
        number.add(30);
        number.add(4, 100);

        System.out.println(number);
        System.out.println("Size = " + number.size());

        boolean isEpt = number.isEmpty();
        System.out.println("ArrayList is empty: " + isEpt);

        boolean isHere = number.contains(30);
        System.out.println("is here the number 30: " + isHere);

        int idexPos = number.indexOf(30);
        System.out.println("Index of 30 is " + idexPos);

        number.set(4, 50); // for replace any value from index
        System.out.println(number);

        int getN = number.get(3);
        System.out.println("3rd index element: " + getN);

        // number.remove(4);

        // System.out.println("After removeing Content: " + number);
        // System.out.println("After removeing Size = " + number.size());

        // // number.removeAll(number);

        // // System.out.println("After removeing All Content: " + number);
        // // System.out.println("After removeing All the Size = " + number.size());

        // number.clear();
        // System.out.println("After Clear All Content: " + number);

        // for (int i : number) {
        // System.out.println(i + " ");
        // }

        // printing using Iterator
        // Iterator itr = number.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());

        // }

        // printing using for loop
        // System.out.println(number);
        // for (int x : number) {
        // System.out.print(" " + x);
        // }

        // System.out.println("Size = " + number.size());

    }

}
