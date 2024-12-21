//wrapper class
class wrapper 
{
	public static void main(String[] args) 
	{
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';

		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());

		int a = myInt.intValue();
		System.out.println("Integer Value :"+a);
  	}
}