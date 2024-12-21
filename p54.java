import java.util.*;
class p54
{
	public static void main(String args[])
	{
		String str="This is Junagadh, A city of Heritage Site";
		StringTokenizer st = new StringTokenizer(str," ,a,i");

		while(st.hasMoreTokens())
		{
			System.out.println("Value is :"+st.nextToken());
		}
	}
}