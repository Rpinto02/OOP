package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Qual o valor a ser financiado?");
	double valorFinanciado = input.nextDouble();
	System.out.println("Qual o valor da taxa de juros composta?");
	double jurosCompostos = input.nextDouble();
	System.out.println("Qual a quantidade de meses?");
	double meses = input.nextDouble();
	
	double valorFuturo = valorFinanciado*Math.pow((1+jurosCompostos), meses);
	double parcelaMensal = valorFuturo/meses;
	System.out.println("O valor da parcela mensal é: "+parcelaMensal);
	input.close();
}
}
