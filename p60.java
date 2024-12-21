//string 
//String Class
class p60
{
	public static void main(String args[])
	{
		String s1 = new String("Ruparel ");		
		String s2;
		s2 = s1+"Education";
		System.out.println(s2);

		byte ascii[]={65,66,67,68,69};
		String s3 = new String(ascii);
		System.out.println(s3);

		char c[] = {'J','A','V','A'};	
		String s4 = new String(c);
		String s5 = new String(s4);
		System.out.println(s5);

		String s6 = "Ruparel ";
		String s7 = " Education";
		String s8 = s6+s7;
		System.out.println(s8);
	
		String s9 = "Ruparel Education Pvt. Ltd.";
		String s10 = s9.toLowerCase();
		System.out.println(s10);
		String s11 = s9.toUpperCase();
		System.out.println(s11);
		String s12 = s9.replace(s9,s1);
		System.out.println(s12);
								
		System.out.println("Equals  "+s12.equals(s1));
	}
}

