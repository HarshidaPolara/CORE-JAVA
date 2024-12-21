import java.util.*;
class p69
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Banglore");
		list.add("Hyderabad");
		list.add("Ahemdabad");
		System.out.println("Before Replacement list:"+list);
		System.out.println();
		list.set(list.indexOf("Ahemdabad"),"Surat");
		System.out.println("List after replacement:"+list);
	}
}