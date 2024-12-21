import java.util.*;
class p75
{
	public static void main(String args[])
	{
		int n,d,i,rno=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number:");
		n=s1.nextInt();
		while(n!=0)
		{
			d=n%10;
			rno=rno*10+d;
			n=n/10;
		}
		System.out.println("Reversed number:"+rnocl);
	}
}