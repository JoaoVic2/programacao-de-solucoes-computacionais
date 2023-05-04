package Pratica8;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Digite o dividendo: ");
			int dividendo = sc.nextInt();

			System.out.print("Digite o divisor: ");
			int divisor = sc.nextInt();

			int resultado = dividendo / divisor;

			System.out.println("Resultado da divisão: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro ao dividir por zero!");
		} finally {
			sc.close();
		}
	}
}