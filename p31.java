interface p
{
	void dispp();
}
class c1 implements p
{
	public void dispp()
	{
		System.out.println("Implement interface ");
	}
}
class p31
{
	public static void main(String args[])
	{
		c1 c11=new c1();
		c11.dispp();
	}
}