package exercicio4;

public class Pessoa {
	private String nome;
	private int data;
	private float altura;
	private static int anoAtual = 2019;
	
	public Pessoa(String nome, int data, float altura) {
		super();
		this.nome = nome;
		this.data = data;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void imprimir() {
		System.out.println("Nome:"+getNome());
		System.out.println("Data de nascimento:"+getData());
		System.out.println("Altura: "+getAltura());
	}

	public void idade() {
		int idade = anoAtual - getData();
		System.out.println("Idade"+idade);
	}
	
}
