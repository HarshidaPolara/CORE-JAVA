interface transport
{
	void deliver();
}
abstract class animal
{
	abstract void display();
}
class tiger extends animal
{
	void display()
	{
		System.out.println("Tiger Class");
	}
}
class camel extends animal implements transport
{
	void display()
	{
		System.out.println("Camel Class");
	}
	public void deliver()
	{
		System.out.println("Camel delivers");
	}
}
class donkey extends animal implements transport
{
	void display()
	{
		System.out.println("Donkey Class");
	}
	public void deliver()
	{
		System.out.println("Donkey delivers");
	}
}
class deer extends animal
{
	void display()
	{
		System.out.println("Deer Class");
	}
}

class p74
{
	public static void main(String args[])
{
	tiger t=new tiger();
	t.display();
	deer d=new deer();
	d.display();
	camel c=new camel();
	c.display();
	c.deliver();
	donkey doo=new donkey();
	doo.deliver();
	doo.display();
}
}