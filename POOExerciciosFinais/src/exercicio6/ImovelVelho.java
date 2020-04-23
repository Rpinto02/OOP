package exercicio6;

public class ImovelVelho extends Imovel{
	private double desconto;
	public ImovelVelho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public void imprimir() {
		double total= -getDesconto()+getPreco();
		System.out.println("O valor do desconto é "+getDesconto()+".");
		System.out.println("E o valor total é "+total+".");
	}

}
