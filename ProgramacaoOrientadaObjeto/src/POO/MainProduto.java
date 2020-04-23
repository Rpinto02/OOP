package POO;
import java.util.Scanner;

public class MainProduto {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Quantos produtos deseja digitar?");
	int n = input.nextInt();
	String identificador[] = new String[n];
	String nome[] = new String[n];
	String modelo[] = new String[n];
	String tipo[] = new String[n];
	Produto produto1[] = new Produto[n];//ja criei a classe entao posso criar um array/variavel com essa classe
	
	for(int i = 0;i<n;i++) {
	System.out.println("Digite o identificador: ");
	identificador[i] = input.next();
	System.out.println("Digite o nome: ");
	nome[i] = input.next();
	System.out.println("Digite o modelo: ");
	modelo[i] = input.next();
	System.out.println("Digite o tipo: ");
	tipo[i] = input.next();
	

	produto1[i] = new Produto(identificador[i],nome[i],modelo[i],tipo[i]);
	produto1[i].exibirProdutos();
	}
	input.close();
	/*System.out.println("Digite o identificador: ");
	String identificador2 = input.next();
	System.out.println("Digite o nome: ");
	String nome2 = input.next();
	System.out.println("Digite o modelo: ");
	String modelo2 = input.next();
	System.out.println("Digite o tipo: ");
	String tipo2 = input.next();
	
	Produto produto2;
	produto2 = new Produto(identificador2,nome2,modelo2,tipo2);
	
	System.out.println("Digite o identificador: ");
	String identificador3 = input.next();
	System.out.println("Digite o nome: ");
	String nome3 = input.next();
	System.out.println("Digite o modelo: ");
	String modelo3 = input.next();
	System.out.println("Digite o tipo: ");
	String tipo3 = input.next();
	
	Produto produto3;
	produto3 = new Produto(identificador3,nome3,modelo3,tipo3);*/
	
	
	
}
}
