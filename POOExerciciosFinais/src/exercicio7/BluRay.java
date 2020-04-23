package exercicio7;

public class BluRay extends Loja {
	private double duracao;

	public BluRay(String nome, double preco, double duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public String toString() {
		return "O nome do Blu-Ray é "+getNome()+", dura "+duracao+" minutos e custa "+getPreco()+".";
	}
	
}
