class x
{
    int a,b;
    void input()
    {
        System.out.print("Enter value of a : ");
        a=Integer.parseInt(System.console().readLine());
        System.out.print("Enter value of b : ");
        b=Integer.parseInt(System.console().readLine());
    }
    void disp()
    {
        System.out.println("a = "+a+" b = "+b);
        System.out.println("Sum = "+(a+b));
    }
}
class p17
{
    public static void main(String args[])
    {
        x x1=new x();
        x x2=new x();
        x1.input();
        x1.disp();
        x2.input();
        x2.disp();
    }    
}