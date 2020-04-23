package POO;


import java.util.Scanner;

public class MainPessoa {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Digite o seu nome:");
	String seuNome = input.next();

	System.out.println("Digite a sua altura:");
	Float suaAltura = input.nextFloat();
	
	System.out.println("Digite o seu CPF:");
	String seuCPF = input.next();
	
	Pessoa novaPessoa = new Pessoa (seuNome, suaAltura, seuCPF);
	
	novaPessoa.imprimirdados();
	
	novaPessoa.setAltura(suaAltura);
	novaPessoa.setCpf(seuCPF);
	input.close();
}
}
