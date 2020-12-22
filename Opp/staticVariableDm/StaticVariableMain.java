package Opp.staticVariableDm;

public class StaticVariableMain {
    public static void main(String[] args) {

        StaticVariableclass user1 = new StaticVariableclass("Monzim", 1697);
        user1.displayInformation();
        user1.countOfTotalObject();

        StaticVariableclass user2 = new StaticVariableclass("Shafiul", 1820);
        user2.displayInformation();
        user2.countOfTotalObject();

        // for static variable/methods not need to declear the object cause static
        // variable/methods not belongs to any object it is directly belongs to the
        // class.
        System.out.println("UserName: " + StaticVariableclass.universityName);

    }

}
