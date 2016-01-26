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
	private Double valorDeCompra;
	private Double valorDeVenda;
	private int quantidade;
	private String categoria;
	private String descricao;
	private String imagem;
	private String cnpjAnunciante;
	private String cnpjSupermercado;

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

	public Double getValorDeCompra() {
		return valorDeCompra;
	}

	public void setValorDeCompra(Double valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
	}

	public Double getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(Double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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

	public String getCnpjSupermercado() {
		return cnpjSupermercado;
	}

	public void setCnpjSupermercado(String cnpjSupermercado) {
		this.cnpjSupermercado = cnpjSupermercado;
	}
}
