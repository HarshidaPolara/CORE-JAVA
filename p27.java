class student
{
	int marks;
	String name;
	student()
	{
		marks=0;
		name=" ";
	}
	
	student(int a, String b)
	{
			marks=a;
			name=b;
	}
	void disp()
	{
		System.out.println("Name of Student :"+name);
		System.out.println("Marks of Student :"+marks);
	}
}
class p27
{
	public static void main(String args[])
	{
		student s1=new student();
		student s2 = new student(79,"ABC");
		s1.disp();
		s2.disp();
	}
}