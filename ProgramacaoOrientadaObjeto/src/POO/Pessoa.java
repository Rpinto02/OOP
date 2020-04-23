package POO;

public class Pessoa {
	private String nome;
	private float altura;//private static final etc vêm sempre antes do tipo de variável
	private String cpf;

	public Pessoa(String nome, float altura, String cpf) {
		this.nome = nome;
		this.altura = altura;
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public Float getAltura() {
		return this.altura;
	}

	public void setAltura(float novaAltura) {
		if (altura > 0) {
			this.altura = novaAltura;
		} else {
			System.out.println("A altura introduzida não é válida.");
		}
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String novoCpf) {
		if (novoCpf.length() == 9) {
			this.cpf = novoCpf;
		} else {
			System.out.println("O número introduzido deve ter 9 dígitos.");
		}

	}

	public void imprimirdados() {
		System.out.println("O nome da pessoa é " + nome + ".");
		System.out.println("A altura é " + altura + ".");
		System.out.println("CPF: " + cpf + ".");
	}
}
