//String function
class p45
{
    public static void main(String[] args)
    {
		String myStr = "Hello";
		char result = myStr.charAt(1);
		System.out.println("Display :"+result);

		String myStr1 = "Hello";
		int result1 = myStr1.codePointAt(0);
		System.out.println("Display :"+result1);

		String myStr2 = "Hello";
		String myStr3 = "Hello";
		System.out.println("Display :"+myStr2.compareTo(myStr3));

		String myStr4 = "HELLO";
		String myStr5 = "helLo";
		System.out.println("Display :"+myStr4.compareToIgnoreCase(myStr5));

		String myStr6 = " Hello";
		String myStr7 = " World";
		System.out.println("Display :"+myStr7.concat(myStr6));

		String myStr8 = "Hello";
		System.out.println("Display :"+myStr8.contentEquals("Hello"));  
		System.out.println("Display :"+myStr8.contentEquals("e"));      
		System.out.println("Display :"+myStr8.contentEquals("Hi")); 

		String myStr9 = "Hello planet earth, you are a great planet.";
		System.out.println("Display :"+myStr9.indexOf("planet"));

		String myStr10 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Display :"+myStr10.length());

		String myStr11 = "Hello";
		System.out.println("Display :"+myStr11.replace('l', 'L'));

		String myStr12 = "       Hello World!       ";
		System.out.println("Display :"+myStr12);
		System.out.println("Display :"+myStr12.trim());
    }
} 

