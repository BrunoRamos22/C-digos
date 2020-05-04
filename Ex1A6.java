public class MyClass {
    public static void main(String args[]) {
      
      char primeira_cadeia[] = {'G', 'C', 'T', 'A', 'G', 'T', 'G', 'A', 'T', 'A', 'C', 'G', 'G', 'C', 'G', 'A'};
      char segunda_cadeia[] = {'C', 'G', 'A', 'T', 'C', 'A', 'C', 'T', 'A', 'T', 'G', 'C', 'C', 'G', 'C', 'T'};
      
      boolean primeira_mutacao = false;
      boolean segunda_mutacao = false;
      
      for(int i=0; i<primeira_cadeia.length; i++){
          
          if(primeira_cadeia[i] == 'T'  && primeira_cadeia[i+1] == 'G'){
              primeira_mutacao = true;
          }
      }
      
       for(int i=0; i<segunda_cadeia.length; i++){
          
          if(segunda_cadeia[i] == 'A'  && segunda_cadeia[i+1] == 'C'){
              segunda_mutacao = true;
    }
}

    if(primeira_mutacao && segunda_mutacao){
        System.out.println(Mutante() );
    }else{
        System.out.println(Normal() );
    }
    }
    
    public static String Mutante(){
        return "Mutação encontrada";
    }
    
    public static String Normal(){
        return "DNA normal";
    }
}

