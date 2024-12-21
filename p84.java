import java.util.*;
class p84
{
	public static void main(String args[])
	{
		int no,rem,n=0,i;
		float result=0,temp;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter no:");
		no=s1.nextInt();
		for(i=no;i!=0;i=i/10)
		{
			n++;

		}
			temp=1;
		for(i=no;i!=0;i=i/10)
		{
			rem=i%10;
			for(int j=0;j<n;j++){
			temp=temp*rem;}
		
		 result=result+temp;}
		if (result==no){System.out.println(no+"is armstrong");}
		else{System.out.println(no+"is not armstrong");}
	}
}