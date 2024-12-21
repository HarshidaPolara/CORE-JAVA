//CALENDAR class
import java.util.*;
class p43
{
	public static void main(String arg[])
	{
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(c.YEAR));
		System.out.println(c.get(c.HOUR));
		System.out.println(c.get(c.HOUR_OF_DAY));
		System.out.println(c.get(c.MINUTE));

		Date d=new Date();
		System.out.println(d);
	}
}
