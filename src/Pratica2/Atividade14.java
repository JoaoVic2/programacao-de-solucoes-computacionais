package Pratica2;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um comando Git (clone, fetch ou pull):");
		String comando = sc.nextLine().toLowerCase();
		switch (comando) {
		case "clone":
			System.out.println("O comando 'git clone' é utilizado para fazer uma cópia de um repositório Git existente.");
			System.out.println("Exemplo:");
			System.out.println("git clone https://github.com/user/repo.git");
			break;
		case "fetch":
			System.out.println("O comando 'git fetch' é utilizado para buscar todas as branches de um repositório remoto.");
			System.out.println("Exemplo:");
			System.out.println("git fetch origin");
			break;
		case "pull":
			System.out.println("O comando 'git pull' é utilizado para atualizar o repositório local com as mudanças feitas no repositório remoto.");
			System.out.println("Exemplo:");
			System.out.println("git pull origin main");
			break;
		default:
			System.out.println("Comando inválido.");

		}
		sc.close();
	}

}
