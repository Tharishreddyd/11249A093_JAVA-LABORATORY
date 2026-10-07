import java.util.*;

public class GregorianCalendarDemo{
    public static void main(String[]args){
        GregorianCalendar cal=new GregorianCalendar();

        int day= cal.get(Calendar.DAY_OF_MONTH);
        int month=cal.get(Calendar.MONTH)+1;
        int year=cal.get(Calendar.YEAR);

        System.out.println("Gregorian Calendar");
        System.out.println("------------------");

        System.out.println("Date:"+day+"/"+month+"/"+year);

        if(cal.isLeapYear(year)){
            System.out.println(year+"is a Leap Year");
        }else{
            System.out.println(year+"is not a Leap Year");


        }
        System.out.println("Day of Year:"+cal.get(Calendar.DAY_OF_YEAR));     
    }
}