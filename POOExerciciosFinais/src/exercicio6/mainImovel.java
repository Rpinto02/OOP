package exercicio6;

public class mainImovel {
public static void main(String[] args) {
	
	ImovelNovo imovelNovo = new ImovelNovo("Piedade", 420000.0,5000.0);
	ImovelVelho imovelVelho = new ImovelVelho("Candeias",400000.0,10000.0);
	
	imovelNovo.imprimir();
	
	imovelVelho.imprimir();
}
}
