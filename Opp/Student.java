package Opp;

public class Student {

    String name, gender;
    int number, roll, age;

    void setInformation(String n, String g, int num, int ro, int ag) {

        name = n;
        gender = g;
        number = num;
        roll = ro;
        age = ag;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Roll: " + roll + "\n");
    }

}
