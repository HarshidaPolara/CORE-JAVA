class  p7
{
	public static void main (String args[]) 
	{
		int a,b;

		System.out.print("Enter Value of A:");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Value of B:");
		b = Integer.parseInt(System.console().readLine());

		if(a==b)
		{	
			System.out.println("Both Value Are Equal");			
		}	
		else
		{
			System.out.println("Both Value Are Not Equal");
		}
	}
}