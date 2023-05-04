package Pratica2;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double n1 = sc.nextDouble();

		System.out.println("Digite o segundo número: ");
		double n2 = sc.nextDouble();

		System.out.println("Digite o número da ação desejada:\n" + "1 - Somar os dois números.\r\n"
				+ "2 - Multiplicar os dois números.\r\n" + "3 - Subtrair o número maior pelo número menor.\r\n"
				+ "4 - Dividir o primeiro número pelo segundo.");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("O resultado da soma dos dois números é: " + (n1 + n2));
			break;
		case 2:
			System.out.println("O resultado da multiplicação dos dois números é: " + (n1 * n2));
			break;
		case 3:
			if (n1 > n2) {
				System.out.println("O resultado da subtração dos dois números é " + (n1 - n2));
			} else if (n2 > n1) {
				System.out.println("O resultado da subtração é: " + (n2 - n1));
			} else {
				System.out.println("O resultado da subtração é: 0");
			}
			break;
		case 4:
			if (n1 == 0 || n2 == 0) {
				System.out.println("Não existe divisão por 0!");
			} else {
				System.out.println("O resultado da divisão do primeiro número pelo segundo é: " + (n1 / n2));
			}
			break;
		}
		sc.close();
	}
}
