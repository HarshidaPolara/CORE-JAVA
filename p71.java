interface eventlistener
{
	void performevent();
}
interface mouselistener extends eventlistener
{
 	void mouseclicked();
	void mousepressed();
	void mousereleased();
	void mousemoved();
	void mousedragged();
}
interface keylistener extends eventlistener
{
	void keypressed();
	void keyreleased();
}
 class event implements mouselistener, keylistener
{
	public void performevent()
	{
		System.out.println("Perform Event Method");
	}
	public void mouseclicked()
	{
		System.out.println("Mouse Clicked");
	}
	public void mousepressed()
	{
		System.out.println("Mouse Pressed");
	}
	public void mousemoved()
	{
		System.out.println("Mouse Moved");
	}
	public void mousereleased()
	{
		System.out.println("Mouse released");
	}
	public void mousedragged()
	{
		System.out.println("Mouse Drraged");
	}
	public void keypressed()
	{
		System.out.println("Key Pressed");
	}
	public void keyreleased()
	{
		System.out.println("Key Released");
	}

}

class p71
{
	public static void main(String args[])
	{
		event e =new event();
		e.performevent();
		e.mouseclicked();
		e.mousepressed();
		e.mousereleased();
		e.mousemoved();
		e.mousedragged();
		e.keypressed();
		e.keyreleased();
	}
}