package Cliente;

public class Cliente {
	public String nome;
	public int cpf;
	public float valorGasto;
	public Cliente(String nome, int cpf, float valorGasto) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.valorGasto = valorGasto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public float getValorGasto() {
		return valorGasto;
	}
	public void setValorGasto(float valorGasto) {
		this.valorGasto = valorGasto;
	}
	
	
}
