package JavaBeg;

public class IncrementDecrement {
    public static void main(String[] args) {

        int x = 25;
        int y;

        // increment
        y = x++;
        System.out.println("post increment y++ = " + y); // post increment x = 25
        y = x;
        System.out.println("y = " + y); // post increment x = 26

        y = ++x;
        System.out.println("pre increment ++y = " + y); // pre increment x = 27
        y = x;
        System.out.println("y = " + y); // pre increment x = 27

        // decrement
        y = x--;
        System.out.println("post decrement y-- = " + y); // post decrement x = 27
        y = x;
        System.out.println("y = " + y); // post decrement x = 26

        y = --x;
        System.out.println("pre decrement --y = " + y); // pre decrement x = 25
        y = x;
        System.out.println("y = " + y); // post decrement x = 25

    }

}
