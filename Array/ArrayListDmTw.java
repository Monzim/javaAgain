package Array;

import java.util.ArrayList;

public class ArrayListDmTw {

    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);

        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);

        System.out.println("Number1 ArrayList: " + number1);
        System.out.println("Number2 ArrayList: " + number2);

        number3.addAll(number1);
        System.out.println("Number3 ArrayList: " + number3);

        boolean isNum12 = number1.equals(number2);
        System.out.println("Is num1 == num2: " + isNum12);

        boolean isNum13 = number1.equals(number3);
        System.out.println("Is num1 == num3: " + isNum13);

    }

}
