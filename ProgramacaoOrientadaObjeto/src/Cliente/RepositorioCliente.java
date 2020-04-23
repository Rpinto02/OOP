package Cliente;

import java.util.Scanner;

public class RepositorioCliente {

	public Cliente[] repositorio;
	private int indice;
	private final static int indiceMax = 10;
	Scanner input = new Scanner(System.in);

	public RepositorioCliente() {
		indice = 0;
		repositorio = new Cliente[indiceMax];
	}
	public void adicionarCliente (Cliente cliente) {
		repositorio[indice] = cliente;
		indice = indice + 1;
	}
	public int buscarCliente (Cliente cliente) {
		int indiceBusca = -1;
		for (int i=0; i<=repositorio.length;i++){
			if (repositorio[i].equals(cliente)) {
				indiceBusca = i;
				break;
			}
			
		}
		if(indiceBusca == -1) {
			System.out.println("Conta não encontrada.");
		}else {
			System.out.println("A conta se encontra na posição "+indiceBusca+".");
		}return indiceBusca;
	}
	public void removerCliente (Cliente cliente) {
		int novoIndice = buscarCliente(cliente);
		if (novoIndice !=-1) {
			repositorio[novoIndice]=repositorio[indice-1];
			repositorio[indice-1]=null;
			indice = indice - 1;	
		}else {
			System.out.println("Não pode remover um cliente que não existe.");
		}
		
	}
	public void atualizarCliente (Cliente cliente) {
		int indiceAtualizar = buscarCliente(cliente);
		if (indiceAtualizar != -1) {
			System.out.println("Digite o novo nome: ");
			String novoNome = input.next();
			System.out.println("Digite o novo cpf: ");
			int novoCpf = input.nextInt();
			System.out.println("Digite o novo valor gasto: ");
			Float novoValorGasto = input.nextFloat();
			Cliente novoCliente = new Cliente(novoNome, novoCpf, novoValorGasto);
			repositorio[indiceAtualizar]= novoCliente;
		}else {
			System.out.println("Não pode atualizar um cliente que não existe.");
		}
	}
	public void maxValorGasto() {
		float maxVG = repositorio[0].getValorGasto();
		int indicemaxVG = 0;
		for (int i = 0;i<indice;i++) {
			if (maxVG<repositorio[i].getValorGasto()) {
				maxVG=repositorio[i].getValorGasto();
				indicemaxVG = i;
			}
		}System.out.println("O maior valor gasto foi: "+maxVG+" e pertence ao cliente "
				+ "com o Cpf:"+repositorio[indicemaxVG].getCpf()+".");
				
	}
	
	public void minValorGasto() {
		float minVG = repositorio[0].getValorGasto();
		int indiceminVG = 0;
		for (int i = 0;i<indice;i++) {
			if (minVG>repositorio[i].getValorGasto()) {
				minVG=repositorio[i].getValorGasto();
				indiceminVG = i;
			}
		}System.out.println("O menor valor gasto foi: "+minVG+" e pertence ao cliente "
				+ "com o Cpf:"+repositorio[indiceminVG].getCpf()+".");
				
	}
	public void procurarNome(int procuraCpf) {
		String nomeEncontrado = "";
		int contador = 0;
		for (int i = 0;i<indice;i++) {
			if (procuraCpf == repositorio[i].getCpf()) {
				nomeEncontrado = repositorio[i].getNome();
				break;
			}else {
				contador = contador + 1;
			}
		}
		if(contador == indice) {
			System.out.println("Não existe nenhum cliente com esse CPF");
		}else {
			System.out.println("O cliente do CPF: "+procuraCpf+" tem o nome: "+nomeEncontrado+".");
		}
		
		
	}
}
	
	