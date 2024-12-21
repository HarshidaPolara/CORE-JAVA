class student{
	String nm;
	int id;
	
	void get(String a,int b){
		nm=a;
		id=b;
		}
	void display(){
		System.out.println("Student Details ");
		System.out.println("Student name: "+nm);
		System.out.println("Student ID: "+id);
	}	
}
class test extends student{
	double marks;
	void get_marks(double c){
		marks=c;
		}
	void display_marks(){
		System.out.println("Student marks:");
	}
}
class p33{
public static void main(String args[]){
		test t=new test();
		t.get("ABC",001);
		t.display();
		t.get_marks(90);
		t.display_marks();
	}
}