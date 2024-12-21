class factorial
{
    int n,fact=1;
    void get_num(){
        System.out.print("Enter the num:");
        n=Integer.parseInt(System.console().readLine());
    }
    void get_fact()
    {
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial value : "+fact);
    }
}
class p21
{
    public static void main(String args[])
    {
        factorial f1=new factorial();
        f1.get_num();
        f1.get_fact();
    }
}
