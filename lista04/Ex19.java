package lista04;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		
		Scanner  sc= new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O maior valor � "+ valor1);
		} else {
			System.out.println("O maior valor � "+ valor2);
		}
		
		sc.close();
	}

}
