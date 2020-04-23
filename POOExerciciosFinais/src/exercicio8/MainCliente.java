package exercicio8;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCliente extends Exception{
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int numeroClientes = 0;
	try {
		System.out.println("Quantos clientes deseja adicionar?");
		numeroClientes = input.nextInt();
	}catch(InputMismatchException e) {
		System.out.println("Deverá introduzir um número inteiro e diferente de zero para continuar.");
	}

	RepositorioCliente novorepositorio = new RepositorioCliente();
	for(int i=0; i<numeroClientes; i++) {
		System.out.println("Digite o nome: ");
		String nome = input.next();
		System.out.println("Digite o cpf: ");
		int CPF = input.nextInt();
		System.out.println("Digite o valor gasto: ");
		Float valorGasto = input.nextFloat();
		Cliente novoCliente = new Cliente(nome,CPF,valorGasto); 
		novorepositorio.adicionarCliente(novoCliente);
	}
	novorepositorio.maxValorGasto();
	novorepositorio.minValorGasto();
	System.out.println("Que CPF deseja procurar? ");
	int procuraCpf = input.nextInt();
	novorepositorio.procurarNome(procuraCpf);
	input.close();
}
}
