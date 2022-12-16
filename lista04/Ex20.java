package lista04;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: " );
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		
		if (valor1 < valor2) {
			System.out.println(valor1 + ", " + valor2);
		} else {
			System.out.println(valor2 + ", " + valor1);
		}
		sc.close();
	}

}
