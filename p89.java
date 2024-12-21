import java.util.*;
class P89
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n1,n2;
		System.out.print("Enter number 1:");
		n1=s1.nextInt();
		System.out.print("Enter number 2:");
		n2=s1.nextInt();
	
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0  && i%3!=0)
			{
				System.out.println("Number divisible by 2 and not by 3:"+i);
			}
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   