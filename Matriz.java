public class MyClass {
    public static void main(String args[]) {
      
      //for(int i=0; i(<,>,>=,<=,= + coisa); i++)
      //int[] vetor = new int[] {1,2,3,4,5,6,7,8,9} -- vetor
      
      double A[][] = { {1,2,3}, {0,1,3}, {0,0,-1} }; //matriz
      
      //matriz 3x3
      //1 2 3 *Primeira linha&coluna: indice 0
      //0 1 3 *segunda linha&coluna: indice 0
      //0 0 -1 *terceira linha&coluna: indice 0
      
      //System.out.println(A[0][0]);
      //System.out.println(A[0][1]);
      //System.out.println(A[0][2]);
      
      for(int i=0; i<A.length; i++){ //repita linhas
          System.out.println();
          for(int j=0; j<A.length; j++){ //repita colunas
              System.out.println(A[i][j]);
          }
      }
    }
}
