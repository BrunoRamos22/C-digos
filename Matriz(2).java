public class MyClass {
    public static void main(String args[]) {
        
     double A [][] = { {1, 2, 3}, {0, 1, 3}, {0, 0, -1} };
     System.out.println("A soma é: " + soma(A) );
    }
public static double soma(double A[][]){
    double soma = 0;
    
    for (int i = 0; i < A.length; i++){
        for (int j = 0; j < A.length; j++){
            soma = soma + A[i][j];
            //soma += A[i][j]; //acumula
            //soma -= A[i][j];
            //soma *= A[i][j];
        }
    }
    
    return soma;
    
}
    
}
