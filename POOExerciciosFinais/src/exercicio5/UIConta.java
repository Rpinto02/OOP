package exercicio5;

public class UIConta {
public static void main(String[] args) {
	ContaCorrente cliente = new ContaCorrente();
	ContaCorrente clienteEspecial = new ClienteEspecial();
	
	cliente.setSaldo(1000);
	cliente.setQuantia(100);
	cliente.depositar();
	System.out.println(cliente.getSaldo());
	cliente.sacar();
	System.out.println(cliente.getSaldo());
	
	clienteEspecial.setSaldo(1000);
	clienteEspecial.setQuantia(100);
	clienteEspecial.depositar();
	System.out.println(clienteEspecial.getSaldo());
	clienteEspecial.sacar();
	System.out.println(clienteEspecial.getSaldo());
}

}
