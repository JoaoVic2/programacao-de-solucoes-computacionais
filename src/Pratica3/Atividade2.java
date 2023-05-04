package Pratica3;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matricula = 0;

		while (matricula >= 0) {
			System.out.print("Informe a matrícula do aluno (ou um número negativo para sair): ");
			matricula = sc.nextInt();
			if (matricula < 0) {
				break;
			}
			System.out.print("Informe a primeira nota: ");
			double nota1 = sc.nextDouble();
			System.out.print("Informe a segunda nota: ");
			double nota2 = sc.nextDouble();
			System.out.print("Informe a terceira nota: ");
			double nota3 = sc.nextDouble();

			double media = (nota1 + nota2 + nota3) / 3.0;

			if (media >= 70.0) {
				System.out.printf("O aluno com matrícula %d foi aprovado com média %.2f\n" ,matricula , media);
			} else if (media >= 60.0) {
				System.out.printf("O aluno com matrícula %d está em recuperação com média %.2f\n" ,matricula , media);
			} else {
				System.out.printf("O aluno com matrícula %d foi reprovado com média %.2f\n" ,matricula , media);
			}
		}

		sc.close();
	}
}