package Pratica2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triângulo: ");
		int l1 = sc.nextInt();
		
		System.out.println("Digite o segudo lado do triângulo: ");
		int l2 = sc.nextInt();
		
		System.out.println("Digite o terceiro1" + " lado do triângulo: ");
		int l3 = sc.nextInt();
		
		if (l1 == l2 && l1==l3) {
			System.out.println("Triângulo equilátero");
		}
		else if(l1 == l2 || l1 == l3 || l2 == l3){
			System.out.println("Triângulo isóceles");
		}
			else {
				System.out.println("Triângulo escaleno");
			}
		sc.close();
	}
		}


