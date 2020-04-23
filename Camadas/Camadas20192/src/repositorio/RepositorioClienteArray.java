package repositorio;

import excecoes.ClienteException;
import model.Cliente;

public class RepositorioClienteArray implements IRepositorioCliente {
	
	private static RepositorioClienteArray instance;
	
	private RepositorioClienteArray() {
		
	}
	
	public static RepositorioClienteArray getInstancia() {
		if (instance == null) {
			instance = new RepositorioClienteArray();
		}
		return instance;
	}

	@Override
	public void cadastrarCliente(Cliente c) throws ClienteException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existeCliente(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

}
