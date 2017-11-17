package br.com.caelum.jdbc.contato.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {
	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setId(1);
		contato.setNome("Caelum_alterado");
		contato.setEmail("contato@caelum.com.br_alterado");
		contato.setEndereco("R. Vergueiro 3185 cj57_alterado");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();

		// método elegante
		dao.altera(contato);

		System.out.println("Alterado!");

	}
}
