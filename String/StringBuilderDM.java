package String;

public class StringBuilderDM {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Monzim");

        System.out.println("Str : " + str);

        str.append(" Azraf");
        // str.append(2.55);
        System.out.println("Str : " + str);

        System.out.println("str.reverse : " + str.reverse());
        System.out.println("str.delete : " + str.delete(1, 5));

    }

}
