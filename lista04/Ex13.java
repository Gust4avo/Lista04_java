package lista04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite a primeira nota : ");
		int nota1 = sc.nextInt();
		System.out.println("Digite a sua segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.println("Digite a seua terceira nota: ");
		int nota3 = sc.nextInt();
		
		float media_final = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10 ;
		
		System.out.println("A media final do aluno é: " + media_final);
		sc.close();

	}

}
