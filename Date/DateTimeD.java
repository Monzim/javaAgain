package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeD {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
        String dateFF = dateformat.format(date);
        System.out.println("Current date: " + dateFF);

    }

}
