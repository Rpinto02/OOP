package POO;

public class Carro {
	String tipoCambio = "Manual";
	String cor = "Preta";
	String fabricante = "VW";
	double cilindrada = 1.0;
	
	public Carro() {//construtor sem variaveis atribuidas
		
	}
	public Carro(String tipoCambio, String cor, String fabricante) {//construtor
		this.tipoCambio = tipoCambio;//para atribuir o valor introduzido ao valor do objeto
		this.cor = cor;//o this pega os atributos da classe qd têm o mm nome
		this.fabricante = fabricante;
	}
	
	public void freair() {
		System.out.println("Diminuindo a velocidade");
	}
	public void acelerar() {
		System.out.println("Aumentado a velocidade");
	}
	public void virar() {
		System.out.println("Virando à esquerda ou *a direita");
	}
}
