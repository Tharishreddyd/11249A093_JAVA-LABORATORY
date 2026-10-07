import java.util.*;

public class DateTimeDemo{
    public static void main(String[]args){
        Date date = new Date();

        System.out.println("Date Demonstration");
        System.out.println("-------------------");

        System.out.println("Current Date:"+date);
        System.out.println("Current Time:"+date.toString().substring(11,19));
    }
}