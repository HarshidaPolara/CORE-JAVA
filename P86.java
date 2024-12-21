import java.util.*;
class P86
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter a letter:");
		char c=s1.next().charAt(0);

		if(c =='a'||c=='e'||c=='i'||c=='o'||c=='u'||c =='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println(c+"is vowel");
		}
		else
		{
			System.out.println(c+"is consonant");
		}
	}
}