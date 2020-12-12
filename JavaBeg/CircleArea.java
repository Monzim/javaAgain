package JavaBeg;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radious, area;

        System.out.println("Enter your circle Radious");
        radious = input.nextDouble();

        area = radious * radious * 3.1416;
        System.out.println("Area of cicle: " + area);
    }

}
