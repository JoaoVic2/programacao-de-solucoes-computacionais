package Pratica1;
import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite seu ano de nascimento: ");
		int nascimento = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int ano = sc.nextInt();
		
		System.out.printf("Sua idade é: %d%n", (ano - nascimento));
		
		System.out.printf("Sua idade em 2050 será: %d%n", (2050 - nascimento));
		sc.close();
	}

}