package exercicio3;

public class Programador extends Funcionario{
	private static double aumento = 1.2;
	
	public Programador(String nome, double salario) {
		super(nome, salario);
		setNome(nome);
		setSalario(salario);
		setAumento(aumento);
	}

}
