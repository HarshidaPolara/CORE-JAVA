import java.util.*;
class p50
{
    public static void main(String[] args)
    {
		Scanner s1 = new Scanner(System.in);
		int a[][] = new int[2][2];
	
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print("Enter Value is :");
				a[i][j] = s1.nextInt();
			}
		}	

		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
    }
} 

