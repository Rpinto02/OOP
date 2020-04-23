package exercicio3;

import java.util.Scanner;

public class UIFuncionario {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Qual o nome do gerente?");
	String nomeGerente = input.next();
	System.out.println("Qual o salário?");
	double salarioGerente = input.nextDouble();
	Funcionario gerente = new Gerente(nomeGerente,salarioGerente);
	
	System.out.println("Qual o nome do programador?");
	String nomeProgramador= input.next();
	System.out.println("Qual o salário?");
	double salarioProgramador = input.nextDouble();
	Funcionario programador = new Programador(nomeProgramador,salarioProgramador);
	
	System.out.println("Deseja imprimir os dados?S/N");
	String imprimir = input.next();
	if (imprimir.equals("S")|imprimir.equals("s")){
		System.out.println("Nome"+gerente.getNome()+"\n Salário: "+gerente.getSalario());
		System.out.println("Nome"+programador.getNome()+"\n Salário: "+programador.getSalario());
	}
	
	System.out.println("Deseja aumentar o salário?");
	String salario = input.next();
	if (salario.equals("S")|imprimir.equals("s")){
		gerente.aumentaSalario();
		System.out.println("O novo salário é: "+gerente.getSalario());
		programador.aumentaSalario();
		System.out.println("O novo salário é: "+programador.getSalario());
	}
	input.close();
}
}
