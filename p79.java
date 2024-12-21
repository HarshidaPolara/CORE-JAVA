class book
{
	private String au_nm;
	book(String a)
	{
		au_nm=a;
	}
	void display()
	{
		System.out.println("Author of book:"+au_nm);
	}
}
class bookpub extends book
{
	private String title;
	bookpub(String a, String b)
	{
		super(a);
		title=b;
	}
	void display()
	{
		System.out.println("Publication of book:"+title);
	}
}
class paperpub extends book
{
	private String title;
	paperpub(String a, String b)
	{
		super(a);
		title=b;
	}
	void display()
	{
		System.out.println("PaperPublication of book:"+title);
	}
}
class p79
{
	public static void main(String args[])
	{
		book b=new book(args[0]);
		bookpub b1=new bookpub(args[0],args[1]);
		paperpub p1=new paperpub(args[0],args[2]);
		book bb=b;
		bb.display();
		bb=b1;
		bb.display();
		bb=p1;
		bb.display();
	}
}