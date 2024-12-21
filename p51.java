//Jagged array
class p51
{
	public static void main(String args[])
	{

		int a[][] = new int[4][];

		for(int i=0;i<a.length;i++)	//row
		{
			System.out.print("Enter Column Size:");			
			int c = Integer.parseInt(System.console().readLine());

			a[i] = new int[c];

			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter Number:");				
				a[i][j] = Integer.parseInt(System.console().readLine());
			}
		}
		for(int i=0;i<a.length;i++)	//row
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);				
			}
			System.out.println();
		}
	}
}