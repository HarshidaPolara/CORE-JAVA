import java.util.*;
class time 
{
	int h,min;
	Scanner s1= new Scanner(System.in);
	 void get()
		{
			System.out.print("Enter hours:");
			h=s1.nextInt();
			System.out.print("Enter Minutes:");
			min=s1.nextInt();
		}
	 void show()
		{
			System.out.print("Time:"+h+":"+min);
			
		}
	time  add(time t)
		{
			time t1=new time();
			t1.h=h+t.h;
			t1.min=min+t.min;
			if(t1.min>60)
			{
				t1.h++;
				t1.min -=60;
			}
			return t1;
		}
}

class p61
{
	public static void main(String args[])
	{
		time t1=new time();
		time t2=new time();
		time t3;
		t1.get();
		t2.get();
		t3=t1.add(t2);
		t3.show();
	}
}