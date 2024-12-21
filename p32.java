class x
{
	void dispx()
	{
		System.out.println("Method of super class");
	}
}
class y extends x
{
	void dispx()
	{
		super.dispx();
		System.out.println("Method of sub class");
	}
}
class p32
{
	public static void main(String args[])
	{
		y y1=new y();
		y1.dispx();
	}
}