package String;

public class StringBan {
    public static void main(String[] args) {

        String country = "    Bangladesh    is a land of river.   ";
        System.out.println(country);

        String trimCountry = country.trim();
        System.out.println(trimCountry);

        char ch = country.charAt(0); // ...index which charecter
        System.out.println("ch :" + ch);

        int value = country.codePointAt(12); // AsciCode of the indext number charecter
        System.out.println("value :" + value);

        int pos = country.indexOf("a");
        System.out.println("indexOf 'a' :" + pos); // index of the charecter

        int prop = country.lastIndexOf('n'); // last index number of the charecter
        System.out.println("lastIndexOf 'n' :" + prop);

    }

}
