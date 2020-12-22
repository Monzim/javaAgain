package JavaBeg;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        // randomly geneareted Numbers
        System.out.println(
                "\n\t\t*****************************\n \t\t\tRandomNumber \n\t\t*****************************");

        Random random = new Random();
        // int randomNumber = random.nextInt(10); // 0 to 10
        int randomNumber = random.nextInt(11) + 1; // 1 to 10
        System.out.println("RandonNumber: " + randomNumber);

        // int randomNumWithMath = (int) (Math.random() * 10); // 0 to 10
        int randomNumWithMath = (int) (Math.random() * 11) + 1; // 1 to 11

        System.out.println("RandonNumberMathFun: " + randomNumWithMath);

    }

}
