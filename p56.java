import java.io.*;
class p56
{
    public static void main(String args[])
    {
	try{
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.print("Enter your name : ");
        String nm=br.readLine();
        System.out.println("Name = "+nm);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
    }
}
