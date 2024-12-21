import java.io.*;
public class P101 {
  public static void main(String[] args) {
    try{
        File f1= new File ("abc.txt");
        System.out.println("File Name:"+f1.getName());
        System.out.println("File Absolute Path:"+f1.getAbsolutePath());
        System.out.println("File Path:"+f1.getPath());
        System.out.println("File can read?"+f1.canRead());
        System.out.println("File can write?"+f1.canWrite());
    }
    catch(Exception e){}
  }  
}
