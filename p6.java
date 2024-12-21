import java.util.*;
class  p6
{
	public static void main (String args[]) 
	{
		String nm;
		int age;

		Scanner s1 = new Scanner(System.in);

		System.out.print("Enter Name:");
		nm = s1.next();

		System.out.print("Enter Age:");
		age = s1.nextInt();

		System.out.println("Name is:"+nm);
		System.out.println("Age is:"+age);
		s1.close();
	}
}