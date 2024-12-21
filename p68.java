import java.util.*;
import java.util.ArrayList;
class p68
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			list.add(s1.nextInt());
		}
		sort(list);
		System.out.println(list.toString());
	}
	public static void sort(ArrayList<Integer> list)
	{
		java.util.Collections.sort(list);
	}
}