package Pratica5;

import java.util.Scanner;
public class Atividade12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

        sc.close();
    }
}