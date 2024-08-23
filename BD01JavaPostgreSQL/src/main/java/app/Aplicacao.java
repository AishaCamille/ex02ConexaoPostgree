package app;

import java.util.List;

import dao.DAO;
import dao.UsuarioDAO;
import model.Usuario;

public class Aplicacao {
	
	public static void main(String[] args) throws Exception {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		System.out.println("\n\n==== Inserir pessoa === ");
		Usuario pessoa = new Usuario(11, "pablo", 12.00, FALSE);
		if(usuarioDAO.insert(usuario) == true) {
			System.out.println("Inserção com sucesso -> " + pessoa.toString());
		}
		
		System.out.println("\n\n==== Testando autenticação ===");
		System.out.println("Usuário (" + pessoa.getNome() + "): " + pessoaDAO.autenticar(11, "pablo"));
			
		System.out.println("\n\n==== Mostrar usuários que pagaram === ");
		List<Usuario> pessoas = pessoaDAO.getPagoFalse();
		for (Usuario u: pessoas) {
			System.out.println(u.toString());
		}

		System.out.println("\n\n==== Atualizar senha (Id (" + pessoa.getId() + ") === ");
		pessoa.setNome(DAO.toMD5("pablo"));
		pessoaDAO.update(pessoa);
		
		System.out.println("\n\n==== Testando autenticação ===");
		System.out.println("Usuário (" + pessoa.getNOme() + "): " + usuarioDAO.autenticar("pablo", DAO.toMD5("pablo")));		
		
		System.out.println("\n\n==== Invadir usando SQL Injection ===");
		System.out.println("Usuário (" + pessoa.getNome() + "): " + usuarioDAO.autenticar("pablo", "x' OR 'x' LIKE 'x"));

		System.out.println("\n\n==== Mostrar usuários ordenados por código === ");
		usuarios = usuarioDAO.getOrderById();
		for (Usuario u: usuarios) {
			System.out.println(u.toString());
		}
		
		System.out.println("\n\n==== Excluir usuário (Id " + pessoa.getId() + ") === ");
		usuarioDAO.delete(pessoa.getId());
		
		System.out.println("\n\n==== Mostrar usuários ordenados por login === ");
		usuarios = usuarioDAO.getOrderByNome();
		for (Usuario u: usuarios) {
			System.out.println(u.toString());
		}
	}
}
