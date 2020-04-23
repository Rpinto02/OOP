package controlador;

import excecoes.ClienteException;
import model.Cliente;

public class Fachada {
	
	private static Fachada instancia;
	private IControladorCliente controladorCliente;
	
	
	private Fachada(){
		controladorCliente = ControladorCliente.getInstancia();
	}
	
	public static Fachada getInstancia(){
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}

	public void cadastrarCliente(Cliente c) throws ClienteException {
		controladorCliente.cadastrarCliente(c);
	}
	
	public void removerCliente(String cpf) {
		controladorCliente.removerCliente(cpf);
	}

}
