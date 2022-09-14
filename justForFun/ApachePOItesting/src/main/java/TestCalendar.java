import io.cucumber.java.ca.Cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Nikasan
 */
public class TestCalendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
        if (day_of_week == 1 ){
            day_of_week = day_of_week + 1;
        }else {
            if (day_of_week == 7){
                day_of_week = day_of_week -1;
            }
        }
        calendar.set(year, month + 8, day_of_week);
//        int DAY_OF_MONTH = calendar.get(Calendar.DAY_OF_MONTH);
//        System.out.println("Day is " + DAY_OF_MONTH);
        System.out.println("Day is " + calendar.get(Calendar.DATE));
        Date time = calendar.getTime();
       String currentStringDate = new SimpleDateFormat("EEEE d MMMM").format(time);
        System.out.println(currentStringDate);
    }
}

