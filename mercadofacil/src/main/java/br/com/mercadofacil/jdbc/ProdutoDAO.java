package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.mercadofacil.modelo.Produto;

public class ProdutoDAO {

	private Connection conexao;
	Connection con = new FabricaConexao().getConexao();

	// insert
	public void InseriProduto(Produto produto) {
		boolean resultadoInsert;
		String sql = " insert into produto(nome,valor,categoria,descricao,cnpjAnunciante,emailAnunciante,"
				+ "razaoSocialAnunciante,nomeFantasiaSupermercado,razaoSocialSupermercado)"
				+ "values(?,?,?,?,?,?,?,?,?)";

		try {

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getValor());
			stmt.setString(3, produto.getCategoria());
			stmt.setString(4, produto.getDescricao());
			stmt.setString(5, produto.getCnpjAnunciante());
			stmt.setString(6, produto.getEmailAnunciante());
			stmt.setString(7, produto.getRazaoSocialAnunciante());
			stmt.setString(8, produto.getNomeFantasiaSupermercado());
			stmt.setString(9, produto.getRazaoSocialSupermercado());

			stmt.execute();
			stmt.close();
			resultadoInsert=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			resultadoInsert=false;
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
        	produto.setValor(rs.getDouble("valor"));
        	//produto.setDescricao(rs.getString("descricao"));
          
           listaCursos.add(produto);
        }
        rs.close();
        stmt.close();
        return listaCursos;
        
    }

}
