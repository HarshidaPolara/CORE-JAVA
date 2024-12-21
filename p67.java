class member
{
	String nm,add;
	int age,pno;
	float salary;
	void printsalary()
	{
		System.out.println("Salary of employee:"+salary);
	}
}

class emp extends member
{
	String sp;
	emp(String n,int a,int p,String ad,float s ,String se)
	{
		nm=n;
		age=a;
		pno=p;
		add=ad;
		salary=s;
		sp=se;
	}
	void dispemp()
	{
		System.out.println("Employee Details:");
		System.out.println("Employee Name:"+nm);
		System.out.println("Employee Age:"+age);
		System.out.println("Employee ph Number:"+pno);
		System.out.println("Employee Address:"+add);
		printsalary();
		System.out.println("Employee Specialization:"+sp);
	}
}

class manager extends member
{
	String dept;
	manager(String n,int a,int p,String ad,float s ,String d)
	{
		nm=n;
		age=a;
		pno=p;
		add=ad;
		salary=s;
		dept=d;
	}
	void dispmanager()
	{
		System.out.println("Manager Details:");
		System.out.println("Manager Name:"+nm);
		System.out.println("Manager Age:"+age);
		System.out.println("Manager ph Number:"+pno);
		System.out.println("Manager Address:"+add);
		printsalary();
		System.out.println("Manager Department:"+dept);
	}
}

class p67
{
	public static void main(String args[])
	{
		emp e1=new emp("Abc",25,1234567890,"Amd",50000,"Accounting");
		manager m1=new manager("Abcd",29,1234567890,"Rjt",55000,"Sales");
		e1.dispemp();
		System.out.println();
		m1.dispmanager();
	}
}