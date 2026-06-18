package datesAndCalendars;

import java.util.Calendar;
import java.util.Date;

public class datesAndCalendars {

    public static void main (String[] args) {
        datesAndCalendars.displayCurrentDate();
        datesAndCalendars.displaySetDate();
    }
    //Creating a new static method named displayCurrentDate
    private static void displayCurrentDate(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date date = new java.util.Date();
        calendar.setTime(date);
        System.out.println(calendar.getTime());

    }

    //creating a new static method named displaySetDate
    private static void displaySetDate() {
        //Instantiating the Calendar object
        Calendar calendar = Calendar.getInstance();
        //can use SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd"); to change the format of the date
        calendar.set(2031, 02, 02);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
