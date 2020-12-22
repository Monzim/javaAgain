package Opp;

public class Student {

    String name, gender;
    int number, roll, age;

    // constructor
    /*
     * constructor is a special kind of mehtod that's not need to call. t is called
     * when an instance of the class is created. * It set as the same as the class
     */

    // default constructor
    Student() {
        System.out.println("Empty");
    }

    // parameterized constructor
    Student(String n, String g, int num, int ro, int ag) {
        name = n;
        gender = g;
        number = num;
        roll = ro;
        age = ag;
    }

    // displayinformation method
    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Roll: " + roll + "\n");
    }

}
