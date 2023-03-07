package franxx.code.classes;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalender {
    public static void main(String[] args) {
        // menggunakan date
        Date date = new Date();
        long l = date.getTime();

        System.out.println(date);
        System.out.println(l);

        // menggunakan calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.HOUR_OF_DAY, 12);

        Date date1 = calendar.getTime();
        long l1 = date1.getTime();
        System.out.println(date1);
        System.out.println(l1);

    }
}
