package lista04;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		if (valor >= 0) {
			System.out.println("O valor ? positivo");
		} else {
			System.out.println("O valor ? negativo");
		}
		sc.close();
	}

}
