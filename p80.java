class Insufficient_balance_Exception extends Exception
{
	Insufficient_balance_Exception(String msg)
	{
		super(msg);
	}
}
class account
{
	float bal=0;
	account(float b)
	{
		this.bal=b;
	}
	void display()
	{
		System.out.println("Current Balance:"+bal);
	}
	void deposit(float b)
	{
		bal=bal+b;
		System.out .println("Balance after amount deposition:"+bal);
	}
	void withdraw(float b) throws Insufficient_balance_Exception
	{
		if(b>bal){
		throw new Insufficient_balance_Exception("Current balance "+bal+" is less then required amount "+b);
		}
		else{
		bal=bal-b;
		System.out.println("Amount after withdrawl:"+bal);
		}
	}
}
class p80
{
	public static void main(String args[])
	{
		account a=new account(4000);
		a.deposit (3000);
		try
		{
			a.withdraw(5000);
			
		}
		catch(Insufficient_balance_Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}