import java.util.*;
class p39
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("Jhon");
		list.add("Oxford");
		list.add("Australia");
		list.add("education");
		list.add("noblity");
		list.add("Faith");
		System.out.println(list);
		System.out.println("Size of list :"+list.size());
		System.out.println(list.get(1));
		list.set(1,"Enderson");
		System.out.println(list.get(1));
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		list.remove("Faith");
		System.out.println(list);
		System.out.println(list.contains("industry"));
		System.out.println("Size of list :"+list.size());
	}
}