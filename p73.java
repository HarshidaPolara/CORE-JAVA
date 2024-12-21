class thread1 extends Thread
{
	public thread1()
	{
		start();
	}
	public void run()
	{
		for(int i=1;i<1000;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd thread:"+i);
			}
		}
	}
}
class thread2 extends Thread
{
	public thread2()
	{
		start();
	}
	public void run()
	{
		for(int i=1;i<1000;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even thread:"+i);
			}
		}
	}
}
class p73
{
	public static void main(String args[])
	{
		thread1 t1=new thread1();
		thread2 t2= new thread2(); 
	}
}