package exercicio3;

public class Gerente extends Funcionario {
	private static double aumento = 1.1;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
		setNome(nome);
		setSalario(salario);
		setAumento(aumento);
	}

}
