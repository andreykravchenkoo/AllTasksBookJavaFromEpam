package project.Task28;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        DateService dateService = (s) -> {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");
            Date date = new Date();
            try {
                date = sdf.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            SimpleDateFormat sdf24 = new SimpleDateFormat("hh:mm");
            String dateIn24h = sdf24.format(date);
            System.out.println(dateIn24h);
        };

        dateService.dateConvert("11:44 AM");
    }
}
