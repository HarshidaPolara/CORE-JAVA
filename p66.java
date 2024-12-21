class countno
{
	static int n=0;
	static void count_n()
	{
		n=n+1;
		System.out.println("Object called:"+n);
	}
}

class p66
{
	public static void main(String args[])
	{
		countno c1=new countno();
		c1.count_n();
		countno c2=new countno();
		c2.count_n();
	}
}