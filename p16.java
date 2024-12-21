 class  p16
{
	public static void main (String args[]) 
	{
		int i,a,se=0,so=0;
		System.out.print("Enter A:");
		a=Integer.parseInt(System.console().readLine());
		for(i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				se=se+i;
			}
			else			
			{
				so=so+i;
			}
			
		}
		System.out.println("Sum of even numbers:"+se);
		System.out.println("Sum of odd numbers:"+so);
	}
}