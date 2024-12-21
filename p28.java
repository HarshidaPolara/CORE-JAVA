class p
{
	void dispp()
	{
		System.out.println("Parent class");
	}
}
class c extends p
{
	void dispc()
	{
		System.out.println("Child class");
	}
}
class p28
{
	public static void main(String args[])
	{
		c c1=new c();
		c1.dispp();
		c1.dispc();
	}
}