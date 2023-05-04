package Pratica2;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triângulo em cm: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o segundo lado do triângulo em cm: ");
		int y = sc.nextInt();
		
		System.out.println("Digite o terceiro lado do triângulo em cm: ");
		int z = sc.nextInt();
		
        boolean exp1 = Math.abs(y - z) < x && x < y + z;
        boolean exp2 = Math.abs(x - z) < y && y < x + z;
        boolean exp3 = Math.abs(x - y) < z && z < x + y;
        
        if(exp1 && exp2 && exp3) {
        	System.out.println("Os três valores informados podem ser os comprimentos dos lados de um triângulo.");
        }else {
        	System.out.println("Os três valores informados não podem ser os comprimentos dos lados de um triângulo.");
        }
		sc.close();	
	}

}
