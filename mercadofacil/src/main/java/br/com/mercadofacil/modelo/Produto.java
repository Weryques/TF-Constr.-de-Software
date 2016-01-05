/**
 * 
 */
package br.com.mercadofacil.modelo;

/**
 * @author weryquessantos
 *
 */
public class Produto {
	private String nome;
	private Double valor;
	private String categoria;
	private String descricao;
	private String emailAnunciante;
	private String razaoSocialAnunciante;
	private String nomeFantasiaSupermercado;
	private String razaoSocialSupermercado;
	
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
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
	 * @return the emailAnunciante
	 */
	public String getEmailAnunciante() {
		return emailAnunciante;
	}
	/**
	 * @param emailAnunciante the emailAnunciante to set
	 */
	public void setEmailAnunciante(String emailAnunciante) {
		this.emailAnunciante = emailAnunciante;
	}
	/**
	 * @return the razaoSocialAnunciante
	 */
	public String getRazaoSocialAnunciante() {
		return razaoSocialAnunciante;
	}
	/**
	 * @param razaoSocialAnunciante the razaoSocialAnunciante to set
	 */
	public void setRazaoSocialAnunciante(String razaoSocialAnunciante) {
		this.razaoSocialAnunciante = razaoSocialAnunciante;
	}
	/**
	 * @return the nomeFantasiaSupermercado
	 */
	public String getNomeFantasiaSupermercado() {
		return nomeFantasiaSupermercado;
	}
	/**
	 * @param nomeFantasiaSupermercado the nomeFantasiaSupermercado to set
	 */
	public void setNomeFantasiaSupermercado(String nomeFantasiaSupermercado) {
		this.nomeFantasiaSupermercado = nomeFantasiaSupermercado;
	}
	/**
	 * @return the razaoSocialSupermercado
	 */
	public String getRazaoSocialSupermercado() {
		return razaoSocialSupermercado;
	}
	/**
	 * @param razaoSocialSupermercado the razaoSocialSupermercado to set
	 */
	public void setRazaoSocialSupermercado(String razaoSocialSupermercado) {
		this.razaoSocialSupermercado = razaoSocialSupermercado;
	}
}
