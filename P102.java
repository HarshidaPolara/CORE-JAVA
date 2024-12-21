import java.io.*;

public class P102 {
    public static void main(String[] args) {
        int ttword = 0, ttnumber = 0, other = 0;
        BufferedReader b = null;
        try {
            FileReader tr = new FileReader("abc.txt");
            b = new BufferedReader(tr);
            StreamTokenizer st = new StreamTokenizer(b);
            st.ordinaryChar(' ');

            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                switch (st.ttype) {
                    case StreamTokenizer.TT_WORD:
                        ttword++;
                        System.out.println("Word is: " + st.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        ttnumber++;
                        System.out.println("Number is: " + st.nval);
                        break;
                    default:
                        other++;
                        System.out.println("Other char is: " + (char) st.ttype);
                        break;
                }
            }
            System.out.println("Word Token is: " + ttword);
            System.out.println("Number Token is: " + ttnumber);
            System.out.println("Other Token is: " + other);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}