import java.util.Scanner; 
public class MyClass {
	public static void main(String args[]) {
	
		int A, B, C, D, E, F, G;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Todas as escolhas devem ser escritas nos números (1 ou 2)");
		System.out.println("Escolha: 1- vertebrados ou 2- invertebrados");
		
		A = sc.nextInt();
		if(A == 1) {
			System.out.println("Escolha: 1- Ave ou 2- Mamífero");
			B = sc.nextInt();
			if (B == 1) {
				System.out.println("Escolha: 1- Carnívoro ou 2- Onívoro");
				C = sc.nextInt();
				if (C == 1) {
					System.out.println("Aguia");
				}else {
					System.out.println("Pomba");
				}
			}else {
				System.out.println("Escolha: 1- Onivoro ou 2- Herbívoro");
				D = sc.nextInt();
				if (D == 1) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");
				}
				}
		}else {
			System.out.println("Escolha: 1- Inseto 2- Anelídeo");
			E = sc.nextInt();
			if(E == 1) {
				System.out.println("Escolha: 1- Hematófago 2- Herbívoro");
				F = sc.nextInt();
				if(F == 1) {
					System.out.println("Pulga");
				}else {
					System.out.println("Lagarta");
				}
			}else {
				System.out.println("Escolha 1- Hematófago ou 2- Onívoro");
				G = sc.nextInt();
				if(G == 1) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("Minhoca");
				}
				
			}
			}
		}
}
