package exercicio7;

public class CDs extends Loja{
	private int faixas;
	public CDs (String nome, double preco, int faixas) {
		super(nome, preco);
		this.faixas = faixas;
	}
	
	
	public int getFaixas() {
		return faixas;
	}


	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}


	public String toString() {
		return "O nome do CD é "+getNome()+", tem "+faixas+" faixas, e custa "+getPreco()+".";
	}
} 


