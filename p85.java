import java.util.*;
class p85
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s1.nextInt();		
		
		if(n>0)
		{
			System.out.println(n+"is positive");
		}
		else if(n<0)
		{
			System.out.println(n+"is negative");
		}
	}
}