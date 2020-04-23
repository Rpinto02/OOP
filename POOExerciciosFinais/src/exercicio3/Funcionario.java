package exercicio3;

public abstract class Funcionario {
	private String nome;
	private double salario;
	private double aumento;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getAumento() {
		return aumento;
	}


	public void setAumento(double aumento) {
		this.aumento = aumento;
	}

	
	public Funcionario(String nome, double salario) {
		super();
		
	}


	public void aumentaSalario() {
		this.salario = salario*aumento;
	}
}
