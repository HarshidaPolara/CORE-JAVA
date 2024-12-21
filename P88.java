import java.util.*;
class P88
{
	public static void main(String args[])
	{
		int calls;
		double bill=0.0;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter number of calls:");
		calls=s1.nextInt();
		
		if (calls<=100)
		{
			bill=200;
		}
		else if (calls>100 && calls<=150)
		{
			bill=200+(0.6*(calls-100));
		}
		else if (calls>150 && calls<=200)
		{
			bill=200+((0.60*50)+(0.50*(calls-150)));
		}
		else if (calls>200)
		{
			bill=200+((0.60*50)+(0.50*50)+(0.40*(calls-200)));
		}
		System.out.println("Bill Amount: "+bill);
	}
}