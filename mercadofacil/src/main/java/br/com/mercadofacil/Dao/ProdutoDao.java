package br.com.mercadofacil.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.mercadofacil.modelo.Produto;

public class ProdutoDao {

	private Connection conexao;
	Connection con = new ConnectionFactory().getConnection();

	// insert
	public void InseriProduto(Produto produto) {

		String sql = " insert into produto(nome,valorCompa,valorVenda,categoria,descricao,imagem,cnpjSupermercado,cnpjAnunciante)"
				+ "values(?,?,?,?,?,?,?,?)";

		try {

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getValorDeCompra());
			stmt.setDouble(3, produto.getValorDeVenda());
			stmt.setString(4, produto.getCategoria());
			stmt.setString(5, produto.getDescricao());
			stmt.setString(6, produto.getImagem());
			stmt.setString(7, produto.getCnpjSupermercado());
			stmt.setString(8, produto.getCnpjAnunciante());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
	
    public  ArrayList<Produto> getLista(String categoria) throws SQLException{
    	String sql;
    	if(categoria.equals("Todos")){
    		sql="select *from produto";
    	}else{
    		sql="select *from produto where categoria='"+categoria+"'";
    	}
        PreparedStatement stmt=this.con.prepareStatement(sql);
        
        ResultSet rs=stmt.executeQuery();
        
        ArrayList<Produto> listaCursos=new ArrayList<Produto>();
        while(rs.next()){
        	
        	Produto produto = new Produto();
          
        	produto.setNome(rs.getString("nome"));
        	produto.setCategoria(rs.getString("categoria"));
        	produto.setValorDeVenda(rs.getDouble("valorVenda"));
        	//produto.setDescricao(rs.getString("descricao"));
          
           listaCursos.add(produto);
        }
        rs.close();
        stmt.close();
        return listaCursos;
        
    }

}
