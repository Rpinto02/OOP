package exercicio5;

public class ClienteEspecial extends ContaCorrente {
	
	public double sacar() {
		double saldo = getSaldo() - getQuantia() - (getQuantia()*0.001);
		setSaldo(saldo);
		return saldo;
	}
}
