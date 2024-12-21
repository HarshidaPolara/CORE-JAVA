//Thread class
class threadx extends Thread
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
class p62
{
	public static void main(String args[])
	{
		System.out.println("Program Start");
		threadx t = new threadx();
		t.start();
		System.out.println("Program Stop");
	}
}