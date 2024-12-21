//Runnable interface
class runnablex implements Runnable
{
	public void run()
	{
		try
		{
			int i=0;
			while(i<=5)
			{
				Thread.sleep(1000);
				System.out.println("Hello");
				i++;
			}
		}
		catch(Exception e){}
	}
}
class p63
{
	public static void main(String args[])
	{
		System.out.println("Program Start");
		runnablex r = new runnablex();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Program Stop");
	}
}