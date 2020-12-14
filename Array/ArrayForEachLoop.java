package Array;

public class ArrayForEachLoop {
    public static void main(String[] args) {

        String[] name = { "Fire", "water", "air", "soil", "Heat" };
        int[] num = { 1, 2, 5, 69, 21, 6, 2, 914, };

        for (String x : name) {
            // System.out.println(x);
        }

        int sum = 0;
        for (int x : num) {

            sum = sum + x;

        }
        System.out.println(sum);
        System.out.println(num.length);

    }

}
