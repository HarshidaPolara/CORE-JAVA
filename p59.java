//abstract class
abstract class A
{
	abstract void dispA1();	//abstract method
	void dispA()	//non-abstract method
	{
		System.out.println("non-abstract method : DispA");
	}
}
class B extends A
{
	void dispA1()
	{
		System.out.println("Abstract : DispA1");		
	}
	void dispB()
	{
		System.out.println("DispB");
	}
}
class p59
{
	public static void main(String args[])
	{	
		System.out.println("Main");
		/*A a1 = new B();
		a1.dispA();
		a1.dispA1();*/

		B b1 = new B();
		b1.dispB();
		b1.dispA();
		b1.dispA1(); 
	}
}