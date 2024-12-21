import java.util.Calendar;
import java.util.GregorianCalendar;
 
class p44
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("Calendar date: "+ cal.getTime());
        System.out.print("Gregorian date: "+ gcal.getTime());
    }
} 

