package POO;

public class Produto {
	String identificador;
	String nome;
	String modelo;
	String tipo;
	
	public Produto (String identificador, String nome, String modelo, String tipo) {
		this.identificador = identificador;
		this.nome = nome;
		this.modelo = modelo;
		this.tipo = tipo;
		
		/*System.out.println(identificador);
		System.out.println(nome);
		System.out.println(modelo);
		System.out.println(tipo);*/
	}
	
	public void exibirProdutos(){
		System.out.println(identificador);
		System.out.println(nome);
		System.out.println(modelo);
		System.out.println(tipo);
	}
}
