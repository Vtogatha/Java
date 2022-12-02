package ProgramasVictor;
import java.util.Scanner;
public class inss {

	public static void main(String[] args) {
		//variaveis
		double  sal_bruto, inss_1, inss_2, inss_3, inss_4, soma1, soma2, soma3, soma4, bc_ir, ir;
		Scanner input = new Scanner(System.in);
		//entradas
		System.out.println("Informe o salario bruto: ");
		sal_bruto = input.nextDouble();
		//processamento
		while(sal_bruto != 0) { //estrutura de repeticao
		
		if(sal_bruto <= 1212.00) {//estrutura condicional
			inss_1 = (sal_bruto * 0.075);
			soma1 = inss_1;
			System.out.printf("INSS %.2f\n ", soma1);
			System.out.printf("IRRF isento");
		}
		if(sal_bruto >= 1212.01 && sal_bruto <= 2427.35){
			inss_1 = (float) (1212.00 * 0.075);
			inss_2 = (float) ((sal_bruto - 1212.00) * 0.09);
			soma2 = inss_1 + inss_2;
			System.out.printf("INSS %.2f\n ", soma2);
				if(sal_bruto > 2072.32 && sal_bruto <= 2427.35){
					bc_ir = sal_bruto - soma2;
					ir = (float) ((bc_ir * 0.075) - 142.80);
					System.out.printf("IRRF %.2f", ir);
			}else {
					System.out.printf("IRRF isento");
			}
		
		}
		if(sal_bruto >= 2427.36 && sal_bruto <= 3641.03){
			inss_1 = (float) (1212.00 * 0.075);
			inss_2 = (float) ((2427.35 - 1212.00) * 0.09);
			inss_3 = (float) ((sal_bruto - 2427.35) * 0.12);
			soma3 = inss_1 + inss_2 + inss_3;
			System.out.printf("Inss %.2f ", soma3);
				if(sal_bruto >= 2427.36 && sal_bruto <= 3108.69) {
				bc_ir = sal_bruto - soma3;
				ir = (float) ((bc_ir * 0.075) - 142.80);
				System.out.printf("\nIRRF %.2f", ir);
				
			}
				if(sal_bruto >= 3108.70 && sal_bruto <= 3641.03) {
				bc_ir = sal_bruto - soma3;
				ir = (float) ((bc_ir * 0.15) - 354.80);
				System.out.printf("\nIRRF %.2f", ir);
				
			}
		}
		if(sal_bruto >= 3641.04 && sal_bruto <= 7087.22) {
			inss_1 = (float) (1212.00 * 0.075);
			inss_2 = (float) ((2427.35 - 1212.00) * 0.09);
			inss_3 = (float) ((3641.03 - 2427.35) * 0.12);
			inss_4 = (float) ((sal_bruto - 3641.03) * 0.14);
			soma4 = inss_1 + inss_2 + inss_3 + inss_4;
			System.out.printf("Inss %.2f ", soma4);
		}
			System.out.printf("\nInforme o salario bruto:\n ");
			sal_bruto = input.nextDouble();
		}
		

	}

}
