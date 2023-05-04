package Pratica2;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int codigo;
		 
		 do {
		 System.out.println("Digite o código do produto: ");
		 codigo = sc.nextInt();
		 if (codigo <=0 || codigo > 5) {
			 System.out.println("Codigo inválido, escreva um código de 1 a 5!");
		}
		 }while (codigo <=0 || codigo > 5);
		 
		 switch(codigo) {
		 case 1:
			 System.out.println("O valor do sapato é R$99,99!");
			break;
		 case 2:
			 System.out.println("O valor da bolsa é R$103,89!");
			break;
		 case 3:
			 System.out.println("O valor da camisa é R$49,98!");
			break;
		 case 4:
			 System.out.println("O valor da calça é R$89,72!");
			break;
		 case 5:
			 System.out.println("O valor da blusa é R$97,35!");
			break;
		 }
		 
		sc.close();
	}

}
