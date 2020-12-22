package String;

public class StringBuff {
    public static void main(String[] args) {

        System.out.println(
                "\n\t\t*****************************\n \t\t\tStringBuffer \n\t\t*****************************");
        StringBuffer sb = new StringBuffer("Monzim");
        System.out.println(sb);

        // sb.append("Azraf ");
        // sb.append(17);
        // System.out.println(sb);

        // sb.reverse();
        // sb.append("Azraf ");
        // System.out.println(sb);

        // sb.delete(0, 10);
        // System.out.println(sb);

        sb.reverse();
        sb.delete(0, 3);
        sb.setLength(2);
        // sb.setLength(6);
        System.out.println(sb);

    }

}
