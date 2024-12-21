import java.io.*;
class p19
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.print("Enter first number : ");
        int a=Integer.parseInt(br.readLine());
        System.out.print("Enter second number : ");
        int b=Integer.parseInt(br.readLine());
        System.out.println("Sum = "+(a+b));
    }
}
