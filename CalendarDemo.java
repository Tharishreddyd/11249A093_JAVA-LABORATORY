import java.util.*;

public class CalendarDemo{
    public static void main(String[]args){
        Calendar cal = Calendar.getInstance();

        int day=cal.get(Calendar.DAY_OF_MONTH);
        int month=cal.get(Calendar.MONTH)+1;
        int year=cal.get(Calendar.YEAR);

        int hour= cal.get(Calendar.HOUR_OF_DAY);
        int minute=cal.get(Calendar.MINUTE);
        int second=cal.get(Calendar.SECOND);

        System.out.println("Calendar Demonstration");
        System.out.println("-----------------------");

        System.out.println("Date: " + day + "/" + month + "/" + year);
        System.out.println("TIme:"+hour+":"+minute+":"+second);
    
        
    }
}