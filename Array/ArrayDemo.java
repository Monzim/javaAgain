package Array;

public class ArrayDemo {
    public static void main(String[] args) {

        // int[] number;
        // number = new int[5];

        int[] number = new int[5];

        number[0] = 32;
        number[1] = 3;
        number[2] = 48;
        number[3] = 352;
        number[4] = 2;

        int sum = number[1] + number[2] + number[4];

        System.out.println(number.length);
        System.out.println("Summation: " + sum);

    }

}
