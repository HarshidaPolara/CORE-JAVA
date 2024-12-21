import java.util.*;
class p42
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<args.length;i++)
		{
				list.add(Integer.parseInt(args[i]));
		}
		System.out.println(list);
	}
}