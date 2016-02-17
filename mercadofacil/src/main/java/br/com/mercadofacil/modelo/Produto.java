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
	
	private Anunciante anunciante;
	private Supermercado supermercado;

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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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

	/**
	 * @return the supermercado
	 */
	public Supermercado getSupermercado() {
		return supermercado;
	}

	/**
	 * @param supermercado the supermercado to set
	 */
	public void setSupermercado(Supermercado supermercado) {
		this.supermercado = supermercado;
	}
	

}
