import java.util.*;
class Complex
{
	int r,i,tr,ti;
	Scanner s1=new Scanner(System.in);
	
	void get()
	{
		System.out.println("Enter real part:");
		r=s1.nextInt();
		System.out.println("Enter imaginary part:");
		i=s1.nextInt();
	}
	
	void display()
	{
		System.out.println("Complex Number:"+tr+"+i"+ti);
	}
	void add(Complex c)
	{
		tr=r+c.r;
		ti=i+c.i;
		
	}	
}

class p65
{
	public static void main(String args[])
	{
		 Complex c1=new Complex();
		 Complex c2=new Complex();
		 Complex c3;
		c1.get();
		c2.get();
		c1.add(c2);
		c1.display();
	}
}