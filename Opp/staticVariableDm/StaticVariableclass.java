package Opp.staticVariableDm;

public class StaticVariableclass {
    // for static variable/methods not need to declear the object cause static
    // variable/methods not belongs to any object it is directly belongs to the
    // class.

    String name;
    int id;
    static String universityName = "Du";
    static int count = 0;

    StaticVariableclass(String n, int ro) {
        name = n;
        id = ro;
        count++;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("UniversityName: " + universityName);

    }

    void countOfTotalObject() {
        System.out.println("Count: " + count + "\n");
    }

}
