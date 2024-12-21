import java.util.*;
class p38
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add(5);
		v.add("JHON");
		v.add(22.65);
		v.add('x');
		v.add("Education");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
	}
}