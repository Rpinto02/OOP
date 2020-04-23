package repositorio;

import excecoes.ClienteException;
import model.Cliente;

public interface IRepositorioCliente {
	
	public void cadastrarCliente(Cliente c) throws ClienteException;
	public boolean existeCliente(String cpf);

}
