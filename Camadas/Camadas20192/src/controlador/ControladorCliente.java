package controlador;

import excecoes.ClienteException;
import model.Cliente;
import repositorio.IRepositorioCliente;
import repositorio.RepositorioCliente;

public class ControladorCliente implements IControladorCliente{
	
	private static ControladorCliente instancia;
	private IRepositorioCliente repositorioCliente;
	
	private  ControladorCliente() {
		repositorioCliente = RepositorioCliente.getInstancia();
	}
	
	public static ControladorCliente getInstancia(){
		if (instancia == null) {
			instancia= new ControladorCliente();
		}
		return instancia;
	}

	@Override
	public void cadastrarCliente(Cliente c) throws ClienteException {
		if (repositorioCliente.existeCliente(c.getCpf())) {
			throw new ClienteException("Cliente existente");
		}
		
		repositorioCliente.cadastrarCliente(c);
		
	}

	@Override
	public void removerCliente(String cpf) {
		System.out.println("Cliente removido");
	}

}
