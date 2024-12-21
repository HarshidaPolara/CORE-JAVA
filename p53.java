class A1
{
	void A()
	{
		System.out.println("This is A1");
	}
}
class A2 extends A1
{
	void A()	
	{
		System.out.println("This is A2");
	}
}
class p53
{
	public static void main(String args[])
	{
		A2 a = new A2();

		a.A();
	}
}