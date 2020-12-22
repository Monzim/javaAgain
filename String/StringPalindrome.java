package String;

public class StringPalindrome {

    public static void main(String[] args) {
        System.out.println(
                "\n\t\t*****************************\n \t\t\tStringPalindrome \n\t\t*****************************");

        String s1 = "121";
        StringBuffer sb = new StringBuffer(s1);

        if (s1.equalsIgnoreCase(sb.reverse().toString())) {
            System.out.println("StringPalindrome");

        } else {
            System.out.println("Not StringPalindrome");
        }

    }

}
