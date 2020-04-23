package exercicio7;

import java.util.Scanner;

public class MainLoja {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Quantos itens deseja introduzir?");
	int n = input.nextInt();
	Loja[] artigos = new Loja[n];
	
	for (int i=0;i<n;i++) {
	System.out.println("Para introduzir um livro digite 1."
			+ "\nPara introduzir um CD digite 2."
			+ "\nPara introduzir um Blu-Ray digite 3.");
	int selection = input.nextInt();
	if (selection == 1){
		System.out.println("Digite o nome do livro:");
		String nome = input.next();
		System.out.println("Digite o preço do livro:");
		double preco = input.nextDouble();
		System.out.println("Digite o autor do livro:");
		String autor = input.next();
		Livros livro = new Livros (nome, preco, autor);
		artigos[i] = livro;
	}
	if (selection == 2){
		System.out.println("Digite o nome do CD:");
		String nome = input.next();
		System.out.println("Digite o preço do CD:");
		double preco = input.nextDouble();
		System.out.println("Quantas faixas tem o CD?");
		int faixas = input.nextInt();
		CDs cd = new CDs (nome, preco, faixas);
		artigos[i] = cd;
	}
	if (selection == 3){
		System.out.println("Digite o nome do Blu-Ray:");
		String nome = input.next();
		System.out.println("Digite o preço do Blu-Ray:");
		double preco = input.nextDouble();
		System.out.println("Qual a duração do Blu-Ray?");
		double duracao = input.nextDouble();
		BluRay bluRay = new BluRay (nome, preco, duracao);
		artigos[i] = bluRay;
	}
}
	for (int i =0;i<n;i++) {
		System.out.println(artigos[i]);
	}
	input.close();
}
}
