class p78
{
	public static void main(String args[])
	{
		int r=0;
		try
		{
			int n1,n2;
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[2]);
			char op=args[1].charAt(0);
			
			switch(op)
			{
				case ('+'):
					r=n1+n2;
					System.out.println(args[0]+""+args[1]+""+args[2]+""+r);
					break;
				case ('-'):
					r=n1-n2;
					System.out.println(args[0]+""+args[1]+""+args[2]+""+r);
					break;
				case ('*'):
					r=n1*n2;
					System.out.println(args[0]+""+args[1]+""+args[2]+""+r);
					break;
				case ('/'):
					r=n1/n2;
					System.out.println(args[0]+""+args[1]+""+args[2]+""+r);
					break;
				default:
				System.out.println("improper operator");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}