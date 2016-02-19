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
	private Anunciante anunciante = new Anunciante();
	
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
	 * @return the anunciante
	 */
	public Anunciante getAnunciante() {
		return anunciante;
	}
	/**
	 * @param anunciante the anunciante to set
	 */
	public void setAnunciante(Anunciante anunciante) {
		this.anunciante = anunciante;
	}
}
