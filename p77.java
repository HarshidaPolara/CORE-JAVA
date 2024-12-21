import java.util.*;
class p77
{
	static void fibo(int n)
	{
		int n1=1,n2=1,temp;
		for (int i=0;i<n;i++)
		{
			System.out.println("Fibonacci series:"+n1);
			temp=n2;
			n2=n1+n2;
			n1=temp;
		}
	}
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter number:");
		int n =s1.nextInt();
		fibo(n);
	}
}