package secao06;

import java.util.Scanner;

public class ifelse01 {
	public static void main(String[] args) {
		
		//variaveis
		float peso, m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o peso: ");
		peso = teclado.nextFloat();
		
		//processamento
		if(peso > 50) {
			m = (float) ((peso - 50) * 4.00);
			System.out.printf("Voce devera pagar %.2f de multa", m);
		}else {
			m = 0;
			e = "0";
			System.out.println("multas: " + m);
			System.out.println("excesso: " + e);
		}
		teclado.close();
	}

}
