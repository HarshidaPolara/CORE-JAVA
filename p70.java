abstract class vegetable
{
	String colour;
	vegetable(String colour)
	{
		this.colour=colour;
	}
}
class potato extends vegetable
{
	potato()
	{
		super("cream");
	}
	public String toString()
	{
		return("Potato:"+colour);
	}
}
class tomato extends vegetable
{
	tomato()
	{
		super("red");
	}
	public String toString()
	{
		return("Tomato:"+colour);
	}
}
class brinjal extends vegetable
{
	brinjal()
	{
		super("Purple");
	}
	public String toString()
	{
		return("Brinjal:"+colour);
	}
}
class p70
{
	public static void main(String args[])
	{
		potato p1=new potato();
		tomato t1=new tomato();
		brinjal b1=new brinjal();
		System.out.println(p1.toString());
		System.out.println(t1.toString());
		System.out.println(b1.toString());

	}
}
