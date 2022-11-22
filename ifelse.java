package secao06;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		//variaveis
		int   p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		//entradas
		System.out.println("Informe um numero:");
		int numero = teclado.nextInt();
		//processamento
		if(numero % 2 ==0) {
			p = numero;
		}else {
			i = numero;
			}
		System.out.println(p);
		System.out.println(i);
		teclado.close();
	}

}
