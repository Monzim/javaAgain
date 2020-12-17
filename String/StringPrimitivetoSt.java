package String;

public class StringPrimitivetoSt {
    public static void main(String[] args) {

        // primitive -> to String
        int i = 200;
        String s = Integer.toString(i);
        System.out.println("S = " + s);

        double d = 10.5;
        String e = Double.toString(d);
        System.out.println("e = " + e);

        boolean b = true;
        String g = Boolean.toString(b);
        System.out.println("g = " + g);

        // String -> Primitive
        String sb = " 32";
        int iG = Integer.parseInt(sb);
        System.out.println("iG = " + iG);

        String dD = "10.222";
        Double iD = Double.parseDouble(dD);
        System.out.println("iD = " + iD);

    }

}
