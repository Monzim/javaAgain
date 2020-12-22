package Opp;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = " Azraf al Monzim";
        student1.gender = "male";
        student1.age = 18;
        student1.number = 1236548;
        student1.roll = 1692;

        System.out.println("Student1 name: " + student1.name);
        System.out.println("Student1 gender: " + student1.gender);
        System.out.println("Student1 age: " + student1.age);
        System.out.println("Student1 number: " + student1.number);
        System.out.println("Student1 roll: " + student1.roll);

        Student student2 = new Student();

        student2.name = " Monirul Islam Shamim";
        student2.gender = "male";
        student2.age = 8;
        student2.number = 56565;
        student2.roll = 1697;

        System.out.println("\nStudent2 name: " + student2.name);
        System.out.println("Student2 gender: " + student2.gender);
        System.out.println("Student2 age: " + student2.age);
        System.out.println("Student2 number: " + student2.number);
        System.out.println("Student2 roll: " + student2.roll);

    }

}
