package Pratica2;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1;
		double n2;
		double n3;
		
		do {
		System.out.println("Digite sua primeira nota: ");
		 n1 = sc.nextDouble();
		
		if (n1 < 0 || n1 > 10) {
			System.out.println("Nota inválida! Digite uma nota entre 0 a 10!");
			}
		} while (n1 < 0 || n1 > 10);
		
		do {
			System.out.println("Digite sua segunda nota: ");
		 n2 = sc.nextDouble();
		
		if (n2 < 0 || n2 > 10) {
			System.out.println("Nota inválida! Digite uma nota entre 0 a 10!");
			}
		}while (n2 < 0 || n2 > 10);
		
		do {
			System.out.println("Digite sua terceira nota:");
			 n3 = sc.nextDouble();
		if(n3 < 0 || n3 > 10) {
			System.out.println("Nota inválida! Digite uma nota entre 0 a 10!");
		}
		}while (n3 < 0 || n3 > 10);
		
		double calculaMedia = (n1 + n2 + n3) / 3;
		if(calculaMedia >= 0 && calculaMedia < 3) {
			System.out.println("Reprovado");
		}
		else if(calculaMedia >= 3 && calculaMedia <= 7) {
			System.out.println("Exame");
		}
		else {
			System.out.println("Aprovado");
		}
		sc.close();
	}
}
	


