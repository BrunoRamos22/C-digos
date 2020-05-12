import java.util.Scanner; 

public class MyClass {
    
    public static void main(String args[]) {
      
    int op;    
    int A;
    int B;
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println ("Qual operação deseja realizar?  1 - adição, 2 - subtração, 3 - multiplicação, 4 - divisão");
    op = sc.nextInt();
    
    System.out.println ("digite o primeiro número");
    A = sc.nextInt();
    
    System.out.println ("digite o segundo número");
    B = sc.nextInt();
    
    if(op == 1){
         System.out.println("O resultado é: " + soma(A,B) );
    }else if(op == 2){
         System.out.println("O resultado é: " + subtracao(A,B) );
    }else if(op == 3){
         System.out.println("O resultado é: " + multiplicacao(A,B) );
    }else if(op == 4){
         System.out.println("O resultado é: " + divisao(A,B) );
    }else{ 
        System.out.println("Operação inválida");
    }
    
    }
    
    public static int soma(int A, int B){
        return A + B;
    }
    
    public static int subtracao(int A, int B){
        return A - B;
    }
    
    public static int multiplicacao(int A, int B){
        return A * B;
    }
    
    public static int divisao(int A, int B){
        return A / B;
    }
    
   
}
