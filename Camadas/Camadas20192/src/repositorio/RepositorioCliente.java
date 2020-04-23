package repositorio;

import java.util.ArrayList;
import java.util.List;

import excecoes.ClienteException;
import model.Cliente;

public class RepositorioCliente implements IRepositorioCliente{
	private static RepositorioCliente instancia;
	private List<Cliente> listaCliente;
	
	private  RepositorioCliente() {
		listaCliente = new ArrayList<Cliente>();
	}
	
	public static RepositorioCliente getInstancia(){
		if (instancia == null) {
			instancia = new RepositorioCliente();
		}
		return instancia;
	}

	@Override
	public void cadastrarCliente(Cliente c) throws ClienteException {
		
		if (c == null) {
			throw new ClienteException("Cliente inválido. Objeto nulo");
		}
		if (!existeCliente(c.getCpf())) {
			listaCliente.add(c);
		} else {
			throw new ClienteException("Já existe um cliente com o CPF informado");
		}
	}

	@Override
	public boolean existeCliente(String cpf) {
		for (Cliente c : listaCliente) {
			if (c.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

}
