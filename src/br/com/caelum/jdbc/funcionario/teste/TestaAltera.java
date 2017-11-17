package br.com.caelum.jdbc.funcionario.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaAltera {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setId(1);
		funcionario.setNome("Arquimedes_altera��o");
		funcionario.setUsuario("qui_junior_altera��o");
		funcionario.setSenha("321654");
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.altera(funcionario);
		
		System.out.println("Alterado!");
	}
	
	
}
