import java.io.*;
class p18 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.print("Enter your name : ");
        String nm=br.readLine();
        System.out.println("Name = "+nm);
    }
}
