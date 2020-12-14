package String;

public class StringCon {
    public static void main(String[] args) {

        String firstName = "Azraf";
        String lastName = " Monzim";

        // String fullName = firstName + lastName + 25;
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

        String upperName = fullName.toUpperCase();
        System.out.println("upperCase: " + upperName);

        String lowerName = fullName.toLowerCase();
        System.out.println("lowercase: " + lowerName);

        boolean isStartWith = fullName.startsWith("b");
        System.out.println("isStartWith 'b': " + isStartWith);

        boolean isEndWith = fullName.endsWith("m");
        System.out.println("isEndWith 'm': " + isEndWith);

        String[] naM = { "Monzim", "azraf", "Monir", "Al", "Echo" };

        for (String x : naM) {
            System.out.print(" " + x);

        }

    }

}
