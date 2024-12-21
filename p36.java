class student
{
	String nm;
	int marks;
	student(int a,String b){
		nm=b;
		marks=a;
	}
	void disp(){
		System.out.println("Name of Student:"+nm);
		System.out.println("Marks of Student:"+marks);
	}
}
class p36{
	public static void main(String args[]){
		student[] students=new student[3]; 
		 students[0]=new student(01,"A");
		students[1]=new student(02,"B");
		students[2]=new student(03,"C");
	
for (int i = 0; i < students.length; i++) {
            students[i].disp();
        }
	}
}