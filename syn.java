 class Syn{
    synchronized void call(String tnm){
        System.out.println(tnm+" Thread starts");
        try{
            for (int i=0;i<=5;i++){
                System.out.println(tnm+" Thread is:"+i);
                Thread.sleep(500);
            }
            System.out.println(tnm+" Thread sleep");
        }
        catch(Exception e){}
    }
}
class R1 extends Thread{
    String tname;
    Syn s1;
    R1(Syn s, String tnm){
        s1=s;
        tname=tnm;
        this.start();
    }
    public void run(){
        s1.call(tname);
    }
}
class P98{
    public static void main(String[] args) {
        Syn s=new Syn();
        R1 r1=new R1(s, "ONE");
        R1 r2=new R1(s, "TWO");
        System.out.println("IS THREAD ONE ALIVE:"+r1.isAlive());
        System.out.println("IS THREAD TWO ALIVE:"+r2.isAlive());
        try{
            System.out.println("Wait for thread to finish.....");
            r1.join();
            r2.join();
        }
        catch(Exception e){}
        System.out.println("IS THREAD ONE ALIVE:"+r1.isAlive());
        System.out.println("IS THREAD TWO ALIVE:"+r2.isAlive());
    }
}