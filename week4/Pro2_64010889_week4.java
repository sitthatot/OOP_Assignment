import java.util.GregorianCalendar;

public class Pro2_64010889_week4 {
   public static void main(String[] args) {
       GregorianCalendar gregorianCalendar = new GregorianCalendar();
       System.out.println("Current year, month, date, and day of week");
       System.out.println("Year is " + gregorianCalendar.get(GregorianCalendar.YEAR) );
       System.out.println("Month is " + gregorianCalendar.get(GregorianCalendar.MONTH));
       System.out.println("Date is " + gregorianCalendar.get(GregorianCalendar.DATE));
       System.out.println("Day of week is " + gregorianCalendar.get(GregorianCalendar.DAY_OF_WEEK));
       System.out.println("------------");
       System.out.println("After specified the elapsed time of one day after current day");
       gregorianCalendar.setTimeInMillis(gregorianCalendar.getTimeInMillis() + 86_400_000);
       System.out.println("Year is " + gregorianCalendar.get(GregorianCalendar.YEAR) );
       System.out.println("Month is " + gregorianCalendar.get(GregorianCalendar.MONTH));
       System.out.println("Date is " + gregorianCalendar.get(GregorianCalendar.DATE));
       System.out.println("Day of week is " + gregorianCalendar.get(GregorianCalendar.DAY_OF_WEEK));
       System.out.println(gregorianCalendar.getTime());
   } 
}
