import java.util.*;
class p40
{
	public static void main(String args[])
	{
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(1,"Jhon");
		ht.put(7,"Oxford");
		ht.put(2,"Australia");
		ht.put(9,"education");
		ht.put(5,"noblity");
		ht.put(4,"faith");
		System.out.println(ht);
		System.out.println("Size of ht :"+ht.size());
		System.out.println(ht.get(1));
		System.out.println(ht.get(1));
		System.out.println(ht);
		ht.remove(4);
		System.out.println(ht);
		System.out.println(ht);
		System.out.println(ht.contains("industry"));
		System.out.println("Size of ht :"+ht.size());
		System.out.println("Keys of ht :"+ht.keySet());
		System.out.println(ht.containsKey(7));
		System.out.println(ht.containsValue("Oxford"));
	}
}