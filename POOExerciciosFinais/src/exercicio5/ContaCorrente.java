package exercicio5;

public class ContaCorrente {
	private double saldo;
	private double quantia;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getQuantia() {
		return quantia;
	}
	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}
	
	public double depositar() {
		saldo = getSaldo() + getQuantia();
		return saldo;
	}
	public double sacar() {
		saldo = getSaldo() - getQuantia() - (getQuantia()*0.005);
		return saldo;
	}
	
}
