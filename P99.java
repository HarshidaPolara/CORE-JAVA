import java.io.*;
public class P99 {
    public static void main(String[] args) {
        try{
            FileOutputStream f1= new FileOutputStream("abc.txt");
            for (int i=65;i<=90;i++){
                f1.write((char)i);
            }
            f1.close();
            System.out.println("Work done succesfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

