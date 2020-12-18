package Example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMe {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date: " + date);

        DateFormat dateFor = new SimpleDateFormat("dd/MM/YYYY");
        DateFormat wichDay = new SimpleDateFormat("DD");

        String dateFF = dateFor.format(date);
        String wichDayFF = wichDay.format(date);
        System.out.println("date: " + dateFF + "\n" + wichDayFF + " Day in this year.");

    }

}
