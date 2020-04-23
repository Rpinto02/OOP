package POO;

import java.util.Scanner;

public class MainAluno {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Qual o seu nome? ");
	String nome = input.next();
	System.out.println("Qual o seu curso? ");
	String curso = input.next();
	System.out.println("Qual foi a primeira nota? ");
	float nota1 = input.nextFloat();
	System.out.println("E a segunda? ");
	float nota2 = input.nextFloat();
	
	
	Aluno aluno = new Aluno(nome,curso, nota1, nota2);
	System.out.println(aluno.getNome());
	input.close();
}
}
