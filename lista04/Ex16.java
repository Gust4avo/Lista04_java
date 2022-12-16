package lista04;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maçãs voçê comprou? ");
		int qtd_maca = sc.nextInt();
		
		if (qtd_maca < 12) {
			double preco = 1.30;
			System.out.println("O total a pagar é: " + qtd_maca * preco+" R$");
		} else {
			double preco = 1.00;
			System.out.println("O total a pagar é: " + qtd_maca * preco +" R$");
		}
		sc.close();
	}

}
