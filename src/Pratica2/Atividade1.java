package Pratica2;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua priemira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double n2 = sc.nextDouble();
		
		double calculaMedia = (n1 + n2) / 2;
		
		if (calculaMedia >= 7) {
		System.out.println("Você foi aprovado!");
		}
		else {System.out.println("Você foi reprovado");
		}
		sc.close();
	}
}
