 import java.util.*;
class P91
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,SOdd=0,SEven=0;
		do
		{
			System.out.print("Enter any number:(enter 0 to quit)");
			n=s1.nextInt();
			if(n%2==0 && n>0)
			{
				SEven=SEven+n;
			}
			else if(n%2!=0 && n<0)
			{
				SOdd=SOdd+n;
			}
		}while(n!=0);
		System.out.println("Sum of Positive Even no : "+SEven);
		System.out.println("Sum of Negative Odd no : "+SOdd);

	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       