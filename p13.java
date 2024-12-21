class  p13
{
	public static void main (String args[]) 
	{
		int a,b,ch;
		
		System.out.print("Enter Value of A:");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Value of B:");
		b = Integer.parseInt(System.console().readLine());

		System.out.print("Enter Choice");
		ch = Integer.parseInt(System.console().readLine());

		switch(ch)
		{
			case 1:
				System.out.println("Addition is:"+(a+b));
				break;
			case 2:
				System.out.println("Subtraction is :"+(a-b));
				break;
			case 3:
				System.out.println("Multiplication is :"+(a*b));
				break;
			case 4:
				System.out.println("Division is :"+(a/b));
				break;
			default:
				System.out.println("Wrong Choice.....");
		}
	}
}