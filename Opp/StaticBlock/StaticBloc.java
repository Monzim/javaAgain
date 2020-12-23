package Opp.StaticBlock;

public class StaticBloc {

    static String name, gender;

    static {
        System.out.println("Static Blcok");
        // name = "MOnzim";
        // gender = "Male";

    }

    void display() {
        // System.out.println("Name: " + name);
        // System.out.println("Gender: " + gender);

    }

    public static void main(String[] args) {
        System.out.println("None Stack");
    }

}
