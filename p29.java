class p
{
	void dispp()
	{
		System.out.println("Parent class");
	}
}
class c1 extends p
{
	void dispc1()
	{
		System.out.println("Child 1 class");
	}
}
class c2 extends p
{
	void dispc2()
	{
		System.out.println("Child 2 class");
	}
}
class p29
{
	public static void main(String args[])
	{
		c1 c11=new c1();
		c2 c12=new c2();
		c11.dispp();
		c11.dispc1();
		c12.dispp();
		c12.dispc2();
	}
}