/**
 * 
 */
package br.com.mercadofacil.modelo;

/**
 * @author weryquessantos
 *
 */
public class Produto {
	private int id;
	private String nome;
	private Double valor;
	private String categoria;
	private String descricao;
	private int quantidade;
	
	private String cnpjAnunciante;
	private String emailAnunciante;
	private String razaoSocialAnunciante;
	private String nomeFantasiaSupermercado;
	private String razaoSocialSupermercado;
	private String imagem;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria
	 *            the categoria to set
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
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getCnpjAnunciante() {
		return cnpjAnunciante;
	}

	public void setCnpjAnunciante(String cnpjAnunciante) {
		this.cnpjAnunciante = cnpjAnunciante;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getEmailAnunciante() {
		return emailAnunciante;
	}

	public void setEmailAnunciante(String emailAnunciante) {
		this.emailAnunciante = emailAnunciante;
	}

	public String getRazaoSocialAnunciante() {
		return razaoSocialAnunciante;
	}

	public void setRazaoSocialAnunciante(String razaoSocialAnunciante) {
		this.razaoSocialAnunciante = razaoSocialAnunciante;
	}

	public String getNomeFantasiaSupermercado() {
		return nomeFantasiaSupermercado;
	}

	public void setNomeFantasiaSupermercado(String nomeFantasiaSupermercado) {
		this.nomeFantasiaSupermercado = nomeFantasiaSupermercado;
	}

	public String getRazaoSocialSupermercado() {
		return razaoSocialSupermercado;
	}

	public void setRazaoSocialSupermercado(String razaoSocialSupermercado) {
		this.razaoSocialSupermercado = razaoSocialSupermercado;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

}
