package lista04;

import java.util.Scanner;

public class Ex22 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite as horas trabalhadas no mês: ");
		int horas_trab = sc.nextInt();
		System.out.println("Digite o salario hora: ");
		int salario_hora = sc.nextInt();
		
	
		if (horas_trab > 160) {
			float horaExtra = horas_trab - 160;
			float salario_horaExtra = (((horaExtra * salario_hora * 50/100)+ salario_hora)*horaExtra) ;
			float salarioFinal = salario_horaExtra + (160*salario_hora);
			System.out.println("O salario final é de: " + salarioFinal);
		}else {
			int salario = horas_trab * salario_hora;
			System.out.println("Voçê não fez hora extra: " + salario);
		}
		sc.close();
	}

}
