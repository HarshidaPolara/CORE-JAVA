class  p5
{
	public static void main (String args[]) 
	{
		String nm;
		int age;

		System.out.print("Enter Name:");
		nm = System.console().readLine();

		System.out.print("Enter Age:");
		age = Integer.parseInt(System.console().readLine());

		System.out.println("Name is:"+nm);
		System.out.println("Age is:"+age);
	}
}