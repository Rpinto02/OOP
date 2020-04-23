package exercicio7;

public class Livros extends Loja{
	private String autor;
	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString() {
		return "O nome do livro é "+getNome()+", o seu autor é "+autor+" e custa "+getPreco()+".";
	}
}
