package ui;

import java.util.Scanner;

import controlador.ControladorCliente;
import controlador.Fachada;
import controlador.IControladorCliente;
import excecoes.ClienteException;
import model.Cliente;

public class UiCliente {
	
	private static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		opcaoCliente();
	}
	
	private static void opcaoCliente() {
		Cliente c = new Cliente();
		System.out.println("Digite o cpf");
		c.setCpf(s.next());
		System.out.println("Digite o nome");
		c.setNome(s.next());
		try {
			Fachada.getInstancia().cadastrarCliente(c);
		} catch (ClienteException e) {
			e.printStackTrace();
		}
	}
	
	public static void OpcoesParaProfessor() {}

}
