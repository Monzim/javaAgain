package Opp.overloading_constructor;

public class TeacherMain {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("MOnzim", 1616);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Monzim", "male", 166555, 16);
        teacher3.displayInformation();

    }

}
