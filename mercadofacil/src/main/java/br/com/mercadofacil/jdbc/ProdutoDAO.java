package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.mercadofacil.modelo.Produto;

public class ProdutoDAO {

	Connection con = new FabricaConexao().getConexao();

	// insert
	public void inseriProduto(Produto produto) {
		String sql = " insert into produto(nome,valor,categoria,descricao,cnpjAnunciante,emailAnunciante,"
				+ "razaoSocialAnunciante,nomeFantasiaSupermercado,razaoSocialSupermercado,quantidade)"
				+ "values(?,?,?,?,?,?,?,?,?,?)";

		try {

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getValor());
			stmt.setString(3, produto.getCategoria());
			stmt.setString(4, produto.getDescricao());
			stmt.setString(5, produto.getAnunciante().getCnpjAnunciante());
			stmt.setString(6, produto.getAnunciante().getEmail());
			stmt.setString(7, produto.getAnunciante().getRazaoSocial());
			stmt.setString(8, produto.getSupermercado().getNomeFantasia());
			stmt.setString(9, produto.getSupermercado().getRazaoSocial());
			stmt.setInt(10, produto.getQuantidade());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public ArrayList<Produto> getLista(String categoria) throws SQLException {
		String sql;
		if (categoria.equals("Todos")) {
			sql = "select *from produto";
		} else {
			sql = "select *from produto where categoria='" + categoria + "'";
		}
		PreparedStatement stmt = this.con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		ArrayList<Produto> listaCursos = new ArrayList<Produto>();
		while (rs.next()) {

			Produto produto = new Produto();
			produto.setId(rs.getInt("id"));
			produto.setNome(rs.getString("nome"));
			produto.setCategoria(rs.getString("categoria"));
			produto.setValor(rs.getDouble("valor"));
			// produto.setDescricao(rs.getString("descricao"));

			listaCursos.add(produto);
		}
		rs.close();
		stmt.close();
		return listaCursos;

	}

	public void altera(Produto produto) throws SQLException {
		String sql = "update produto set valor=? where Nome=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(2, produto.getNome());
		stmt.execute();
		stmt.close();
	}

	public void remove(Produto produto) throws SQLException {
		String sql = "delete from produto where id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, produto.getId());
		stmt.execute();
		stmt.close();
	}
}
