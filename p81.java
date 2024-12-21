import java.util.*;
class p81
{
	public static void main(String args[])
	{
		ArrayList <String>list=new ArrayList<String>();
		list.add("Aarav");
		list.add("Kabir");
		list.add("Vivaan");
		list.add("Avinash");
		list.add("Ayaan");

		System.out.println("Main list:"+list);

		ArrayList <String>sublist=new ArrayList<String>();
		for (int i=0;i<list.size();i++)
		{
			if(list.get(i).charAt(0)=='A'){
			sublist.add(list.get(i));}
		}
		System.out.println("Sublist:"+sublist);
	}
}