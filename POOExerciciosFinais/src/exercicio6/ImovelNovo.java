package exercicio6;

public class ImovelNovo extends Imovel{
	private double adicional;
	
	public ImovelNovo(String endereco, double preco, double adicional) {
		super(endereco, preco);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	public void imprimir() {
		double total=getAdicional()+getPreco();
		System.out.println("O valor adicional é "+getAdicional()+".");
		System.out.println("E o valor total é "+total+".");
	}

}
