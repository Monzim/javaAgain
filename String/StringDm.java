package String;

public class StringDm {
    public static void main(String[] args) {

        String m1 = "Azraf Al Monzim";
        String m2 = new String("Azraf Al MoNzim");

        System.out.println("m1 : " + m1);
        System.out.println("m2 : " + m2);

        // char[] s3 = { 'a', 'z', 'r', 'a', 'f' };
        // System.out.println(s3);

        int lenM1 = m1.length();
        System.out.println("Leanth of m1: " + lenM1);

        if (m1.equalsIgnoreCase(m2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }

        // if (m1.contains(m2)) {
        // System.out.println("Equals");
        // } else {
        // System.out.println("Not Equals");
        // }

        boolean cont = m1.contains("Monzim");
        System.out.println("Is m1 contain 'Monzim: " + cont);

        boolean isEmpt = m2.isEmpty();
        System.out.println("Is m1 Empty: " + isEmpt);

    }

}
