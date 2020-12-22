package Opp.overloading_constructor;

public class Teacher {

    // overloading constructor

    String name, gender;
    int phone, age;

    // default constructor
    Teacher() {
        System.out.println("No information");
    }

    // paramiter constructor with two paramiters
    Teacher(String n, int p) {
        name = n;
        phone = p;
    }

    // paramiter constructor with all paramiters
    Teacher(String n, String g, int p, int a) {
        name = n;
        gender = g;
        phone = p;
        age = a;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("Age: " + age + "\n");

    }

}
