package br.com.mercadofacil.jdbc;

public class SelectBD {
	
	public String selecionarIdEndereco(int numero, String cep, String cidade){
		String selectIdEndereco = ""
				+ " SELECT id FROM mercadofacil.endereco"
				+ " WHERE numero = '"+ numero +"' AND cep = '"+ cep +"' AND cidade = '"+ cidade+ "'";
		
		return selectIdEndereco;
	}
}
