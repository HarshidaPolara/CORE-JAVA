import java.util.*;
class p76
{
	public static void si(float p,int t,float r)
	{
		float i;
		i=(p*r*t)/100;
		System.out.println("Simple Interest:"+i);
	}

	public static void main(String args[])
	{
		float p,r;
		int t;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter principle:");
		p=s1.nextFloat();
		System.out.print("Enter time:");
		t=s1.nextInt();
		System.out.print("Enter rate:");
		r=s1.nextFloat();
		si(p,t,r);
	}
}