package Opp;

public class OppDm {
    public static void main(String[] args) {

        // primitive -> to object
        int m1 = 14321;
        Integer opP = Integer.valueOf(m1);
        System.out.println("primitive -> to object : " + opP);

        Integer oppAuto = m1; // autoboxing compiler will add automattic added : Integer.valueOf(x)
        System.out.println("autoboxing : " + oppAuto);

        // object -> to primitive
        Double dD = new Double(10.25);
        System.out.println("double : " + dD);

        double eD = dD.doubleValue();
        System.out.println("doubleValue : " + eD);

        // or
        double fD = dD;
        System.out.println("doubleValue : " + dD); // unboxing compiler will automattic added .doubleValue();
        System.out.println("unboxing : " + fD);

    }

}
