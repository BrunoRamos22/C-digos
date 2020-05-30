import java.util.Scanner;

    public class Ex1 {
    	public static void main(String[]args) {
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.println("Digite uma palavra ou frase:");
    		String palavra = sc.nextLine();
    		String orig = palavra;
    		palavra = palavra.replace(" ","").toLowerCase();
    		String palindromo = "";
    	
    		
    		for(int i = palavra.length() -1; i >= 0; i--){
    			
    			palindromo += palavra.charAt(i);

    		}
    		
    		if(palindromo.equals(palavra)) {
    			System.out.print(orig + " é um palíndromo!");
    		}
    		else {
    			System.out.print(orig + " não é um palíndromo!");
    			
    		}
    		sc.close();
    	}

    }
