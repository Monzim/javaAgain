package Opp;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = " Azraf al Monzim";
        student1.gender = "male";
        student1.age = 18;
        student1.number = 1236548;
        student1.roll = 1692;
        student1.displayInformation();

        Student student2 = new Student();

        student2.name = " Monirul Islam Shamim";
        student2.gender = "male";
        student2.age = 18;
        student2.number = 56565;
        student2.roll = 1697;

        student2.displayInformation();

    }

}
