import java.util.*;
class p83
{
	public static void main(String args[])
	{
		int n,temp,d,rno=0;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter number:");
		n=s1.nextInt();
		temp=n;
		while(n>0)
		{
			d=n%10;
			rno=rno*10+d;
			n=n/10;
		}
		if(temp==rno){
			System.out.println(rno+" is palindrone number");}
		else{
			System.out.println(rno+" is not palindrone number");}
	}
}