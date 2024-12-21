import java.util.*;
class p48
{
    public static void main(String[] args)
    {
		Scanner s1 = new Scanner(System.in);
		int a[] = new int[3];
	
		//input
		for(int i=0;i<=2;i++)
		{
			System.out.print("Enter Value:");
			a[i] = s1.nextInt();
		}	
		//output
		for(int i=0;i<=2;i++)
		{
			System.out.println("Value:"+a[i]);
		}	
    }
} 

