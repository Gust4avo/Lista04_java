package lista04;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o ano que voçê nasceu: ");
		int nasc = sc.nextInt();
		System.out.println("Digite o ano atual: ");
		int ano = sc.nextInt();
		int idade =  ano - nasc;
		
		if (idade <16) {
			System.out.println("Voçê não pode votar!");
		} else if (idade < 18 || idade > 65 ) {
			System.out.println("Voto opcional!");
		}
		else {
			System.out.println("Voto obrigatorio!");
		}
		sc.close();
	}

}
