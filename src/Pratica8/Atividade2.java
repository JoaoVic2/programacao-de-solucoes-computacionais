package Pratica8;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Digite o dividendo: ");
			int dividendo = sc.nextInt();

			System.out.print("Digite o divisor: ");
			int divisor = sc.nextInt();

			Atividade2b.dividir(dividendo, divisor);
		} catch (ArithmeticException e) {
			System.out.println("Erro ao dividir por zero ou dividendo negativo!");
		} finally {
			sc.close();
		}
	}
}
