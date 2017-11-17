package br.com.caelum.jdbc.funcionario.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaLista {

	public static void main(String[] args) {

		FuncionarioDao dao = new FuncionarioDao();

		List<Funcionario> funcionarios = dao.getList();

		for (Funcionario funcionario : funcionarios) {

			System.out.println("Id: " + funcionario.getId());
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Usuario: " + funcionario.getUsuario());
			System.out.println("senha: " + funcionario.getSenha() + "\n");
		}

	}
}
