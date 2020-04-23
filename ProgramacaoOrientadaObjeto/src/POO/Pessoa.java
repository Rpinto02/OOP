package POO;

public class Pessoa {
	private String nome;
	private float altura;//private static final etc v�m sempre antes do tipo de vari�vel
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
			System.out.println("A altura introduzida n�o � v�lida.");
		}
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String novoCpf) {
		if (novoCpf.length() == 9) {
			this.cpf = novoCpf;
		} else {
			System.out.println("O n�mero introduzido deve ter 9 d�gitos.");
		}

	}

	public void imprimirdados() {
		System.out.println("O nome da pessoa � " + nome + ".");
		System.out.println("A altura � " + altura + ".");
		System.out.println("CPF: " + cpf + ".");
	}
}
