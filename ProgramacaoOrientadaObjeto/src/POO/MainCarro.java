package POO;

public class MainCarro {
public static void main(String[] args) {

	Carro mobi = new Carro();//Carro � a classe e mobi o objeto e a sua identidade, new Carro � a inst�ncia do objeto cujos primeiros valores s�o nulos
	mobi.cor = new String("Branco");//atributos
	mobi.tipoCambio = "Manual";//atributos
	mobi.fabricante = "Fiat";//atributos que definem o estado
	
	mobi.acelerar();//comportamento do objeto
	mobi.freair();
	
	Carro hb20;
	hb20 = new Carro("Manual", "Amarelo", "Hyundai");
	hb20.acelerar();
	
}
}
