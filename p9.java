class  p9
{
	public static void main (String args[]) 
	{
		int a,b,c;

		System.out.print("Enter Value of A:");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Value of B:");
		b = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Value of C:");
		c = Integer.parseInt(System.console().readLine());

		if(a>b && a>c)
		{	
				System.out.println("A Max");			
		}
		else if(b>a && b>c)
		{
				System.out.println("B Max");			
		}
		else
		{
				System.out.println("C Max");			
		}
	}
}