package br.com.caelum.jdbc.funcionario.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaRemove {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setId(3);
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.remove(funcionario);
		
		System.out.println("Removido!");
	}
}
