class shape
{
	void area()
	{
		System.out.println("No Area Found!!!");
	}
	void area(int a, int b)
	{
		System.out.println("Area of Square:"+(a*b));
	}
	void area(int r)
	{
		System.out.println("Area of Circle:"+(3.14*r*r));
	}
}
class p34
{
	public static void main(String args[])
	{
		shape s1=new shape();
		s1.area(3,5);
		s1.area();
		s1.area(3);
		
	}
}