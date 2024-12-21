class x
{
	x()
	{
		System.out.println("Constructor with no parameters");
	}
	x(int a,int b)
	{
		System.out.println("Constructor with parameter "+a+" and "+b);
	}
}
class p26
{
	public static void main(String args[])
	{
		x x1=new x(5,2);
		x x2=new x();
	}
}