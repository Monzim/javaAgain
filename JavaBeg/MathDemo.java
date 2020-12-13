package JavaBeg;

public class MathDemo {
    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        int max, min;
        max = Math.max(x, y);
        min = Math.min(x, y);

        System.out.println("Maximum  = " + max);
        System.out.println("Minmum  = " + min);

        int absolute = Math.abs(y);
        System.out.println(absolute);

        double power = Math.pow(x, y);
        System.out.println("x power y =: " + power);

        // round
        int round = Math.round(8.4f);
        System.out.println("Round of 8.5: " + round);
        double roundedDown = Math.round(23.445);
        System.out.println("RoundedDown of 23.445: " + roundedDown);

        double floor = Math.floor(7.343); // floor = 7.0
        System.out.println("Floor of 7.343: " + floor);

        System.out.println(Math.PI); // value of pi

    }

}
