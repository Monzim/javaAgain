package Opp;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInformation("Azraf al Monzim", "male", 1236548, 1692, 18);
        student1.displayInformation();

        Student student2 = new Student();
        student2.setInformation("Monirul Islam Shamim", "male", 56565, 1697, 18);
        student2.displayInformation();

    }

}
