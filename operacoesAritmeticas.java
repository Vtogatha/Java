package secao03;

import java.util.Scanner;

public class operacoesAritmeticas {
	public static void main(String[] args) {
		//variaveis
		int num1, num2, sum, subtraction, mult, div;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo numero: ");
		num2 = teclado.nextInt();
		
		//processamento
		sum = num1 + num2;
		subtraction = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		//saidas
		System.out.println("O valor da soma foi: " + sum);
		System.out.println("O valor da subtracao foi: " + subtraction);
		System.out.println("O valor da multiplicacao foi: " + mult);
		System.out.println("O valor da divisao foi: " + div);
		
		teclado.close();
	}

}
