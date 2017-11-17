package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDao {
	private Connection connection;

	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adicionar(Funcionario funcionario) {

		String sql = "insert into funcionarios (nome, usuario, senha)" + "value (?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}

	public void altera(Funcionario funcionario) {

		String sql = "update funcionarios set nome=?, usuario=?, senha=? where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			stmt.setInt(4, funcionario.getId());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		}

	}

	public void remove(Funcionario funcionario) {

		String sql = "delete from funcionarios where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setInt(1, funcionario.getId());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Funcionario> getList() {

		try {
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from funcionarios");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Funcionario Funcionario = new Funcionario();
				Funcionario.setId(rs.getInt("id"));
				Funcionario.setNome(rs.getString("nome"));
				Funcionario.setUsuario(rs.getString("Usuario"));
				Funcionario.setSenha(rs.getString("senha"));

				// adicionando o objeto à lista
				funcionarios.add(Funcionario);
			}
			rs.close();
			stmt.close();
			return funcionarios;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
