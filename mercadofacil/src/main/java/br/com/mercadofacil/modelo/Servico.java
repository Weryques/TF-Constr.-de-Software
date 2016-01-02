/**
 * 
 */
package br.com.mercadofacil.modelo;

/**
 * @author weryquessantos
 *
 */
public class Servico {
	private String nome;
	private String descricao;
	private String email;
	private String cpnj;
	private String razaoAnunciante;
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the cpnj
	 */
	public String getCpnj() {
		return cpnj;
	}
	/**
	 * @param cpnj the cpnj to set
	 */
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	/**
	 * @return the razaoAnunciante
	 */
	public String getRazaoAnunciante() {
		return razaoAnunciante;
	}
	/**
	 * @param razaoAnunciante the razaoAnunciante to set
	 */
	public void setRazaoAnunciante(String razaoAnunciante) {
		this.razaoAnunciante = razaoAnunciante;
	}
}
