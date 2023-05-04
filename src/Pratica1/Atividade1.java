//ATIVIDADE 1//

package Pratica1;
	//BIBLIOTECA PARA IMPORTAR O SCANNER QUE É A ENTRADA DE DADOS PELO TECLADO DO SISTEMA//
	import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//CHAMANDO A BIBLIOTECA SCANNER//
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Insira o terceiro número: ");
		double n3 = sc.nextDouble();
		
		double media = (n1 + n2 + n3) / 3;
		System.out.printf("a média é de: %.2f%n", media);
		sc.close();
	}

}