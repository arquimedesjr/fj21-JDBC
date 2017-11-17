package br.com.caelum.jdbc.funcionario.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsere {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Arquimedes");
		funcionario.setUsuario("qui_junior");
		funcionario.setSenha("123456");
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.adicionar(funcionario);
		
		System.out.println("Gravado!");
	}

}
