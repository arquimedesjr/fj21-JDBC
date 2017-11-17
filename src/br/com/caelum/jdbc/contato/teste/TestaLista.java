package br.com.caelum.jdbc.contato.teste;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) throws SQLException {
		ContatoDao dao = new ContatoDao();

		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {

			System.out.println("id: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEndereco());
			System.out.println("Endereço: " + contato.getEmail());

			String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTime());
			System.out.println("Data de Nascimento: " + dataFormatada + "\n");

			System.out.println("Antes");
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");

		}
	}
	
}
