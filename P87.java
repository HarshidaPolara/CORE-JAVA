import java.util.*;
class P87
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int sub1=s1.nextInt();
		int sub2=s1.nextInt();
		int sub3=s1.nextInt();
		int sub4=s1.nextInt();
		int sub5=s1.nextInt();

		int total=sub1+sub2+sub3+sub4+sub5;
		double per = total/5;

		System.out.println("Percentage of Student: "+per);		

		if(per>=70)
		{
			System.out.println("Distinction");
		}
		else if(per>=60 && per<70)
		{
			System.out.println("First Class");
		}
		else if(per>=45 && per<60)
		{
			System.out.println("Second Class");
		}
		else if(per>=35 && per<45)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}