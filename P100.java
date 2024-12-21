import java.io.*;

public class P100 {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("abc.txt");
            int i;
            // Read the first character
            while ((i = f1.read()) != -1) { 
                System.out.println("Value is: " + (char) i); 
            }
            f1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}