class y
{
    int a,b;
    void in(){
        System.out.print("Enter A:");
        a=Integer.parseInt(System.console().readLine());
        System.out.print("Enter B:");
        b=Integer.parseInt(System.console().readLine());
    }
    void find_max(){
        if (a>b)
        {
            System.out.println("Max number"+a );
        }
        else{
            System.out.println("Max number"+b );
        }
    }
}
class p20 {
    public static void main(String args[]){
        y y1=new y();
        y1.in();
        y1.find_max();
    }
    
}
