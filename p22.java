class x {
    // Constructor of class x
    x() {
        System.out.println("Constructor call");
    }
}

public class p22 {
    public static void main(String args[]) {
        // Creating an object of class x, which calls the constructor
        x x1 = new x();
    }
}
