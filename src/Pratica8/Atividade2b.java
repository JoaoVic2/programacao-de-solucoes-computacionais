package Pratica8;

public class Atividade2b {
	public static int dividir(int dividendo, int divisor) throws ArithmeticException {
		if (divisor == 0 || dividendo < 0) {
			throw new ArithmeticException();
		}

		int resultado = dividendo / divisor;

		System.out.println("Resultado da divisão: " + resultado);

		return resultado;
	}
}