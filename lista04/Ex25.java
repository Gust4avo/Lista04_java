package lista04;

import java.util.Scanner;

public class Ex25 {
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o numero da sua conta: ");
		float conta = sc.nextFloat();
		System.out.println("Digite o saldo da sua conta: ");
		float saldo = sc.nextFloat();
		System.out.println("Digite o debito da sua conta: ");
		float debito = sc.nextFloat();
		System.out.println("Digite o credito disponivel: ");
		float credito = sc.nextFloat();
		
		double saldo_atual = saldo - debito + credito;
		
		
		if (saldo_atual >= 0) {
			System.out.println(saldo_atual + " Saldo positivo");
		} else {
			System.out.println(saldo_atual + " Saldo negativo");
		}
		
		sc.close();
		
	}

}
