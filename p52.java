class Abc
{
	static int a;	//static member variable
	static void A() //static member method
	{
		System.out.println("Value of A :"+a);
	}
	static void B()
	{
		System.out.println("This is B method");
	}
}
class p52
{
	public static void main(String args[])
	{
		System.out.println("This is Main method");

		Abc.a = 10;
		Abc.A();
		Abc.B();
	}
}