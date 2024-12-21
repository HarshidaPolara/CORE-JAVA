//multiple thread
class ThreadName implements Runnable
{
	String tnm;
	Thread t;
	ThreadName(String threadname)
	{
		tnm = threadname;
		t = new Thread(this,tnm);
		System.out.println("Thread Name :"+tnm);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(tnm+":"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
		System.out.println("Exit from"+tnm);
	}
}
class p64
{
	public static void main(String args[])
	{
		new ThreadName("One");
		new ThreadName("Two");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}	
		System.out.println("Exit from main thread");
	}
}