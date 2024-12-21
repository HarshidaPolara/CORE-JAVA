import java.util.*;
class p72
{
	public static void main(String args[])
	{
		Set h=new HashSet();
		h.add("London");
		h.add("New York");
		h.add("San Francisco");
		h.add("Beijing");
		h.add("New York");

		System.out.println("Size:"+h.size());
		h.remove("Beijing");
		System.out.println("After removing element:"+h);
		System.out.println("Contains Beijing:"+h.contains("Beijing"));
		Set h1=new HashSet();
		h1.add("Rajkot");
		h1.add("Delhi");
		h1.add("Goa");
		System.out.println("Items in set 2:"+h1);
		h.addAll(h1);
		System.out.println("After adding all:"+h);
		h.removeAll(h1);
		System.out.println("After removing all:"+h);
		h1.add("New York");
		h.retainAll(h1);
		System.out.println(h);
		System.out.println(h1);
	}
}