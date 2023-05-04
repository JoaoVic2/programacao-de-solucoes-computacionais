package Pratica1;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio da esfera: ");
		double raio = sc.nextDouble();
		
		double comprimento = 2 * Math.PI * raio;
		
		double area = Math.PI * Math.pow(raio, 2);
		 
		double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3); 
		
		 System.out.printf("Comprimento da esfera: %.2f\n" , comprimento);
	     System.out.printf("Área da esfera: %.2f \n" , area);
	     System.out.printf("Volume da esfera: %.2f\n" , volume);
		sc.close();
	}

}