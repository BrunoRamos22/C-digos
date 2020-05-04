import java.util.Scanner; 

public class MyClass {
    
    public static void main(String args[]) {
        
    int A;
    int B;
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println ("digite o primeiro número");
    A = sc.nextInt();
    
    System.out.println ("digite o segundo número");
    B = sc.nextInt();
    
    System.out.println("PROD = " + prod(A, B) );
    
    }
    
    public static int prod(int A, int B){
        
            return A * B;
    }
}
