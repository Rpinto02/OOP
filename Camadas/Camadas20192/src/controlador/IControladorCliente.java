package controlador;

import excecoes.ClienteException;
import model.Cliente;

public interface IControladorCliente {
	
	public void cadastrarCliente(Cliente c) throws ClienteException;
	public void removerCliente(String cpf);

}
