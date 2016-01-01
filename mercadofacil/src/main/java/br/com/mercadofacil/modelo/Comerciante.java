/**
 * 
 */
package br.com.mercadofacil.modelo;

/**
 * @author weryquessantos
 *
 */
public class Comerciante extends Usuario{
	private String cnpjComerciante;
	private Supermercado supermercado = new Supermercado();

	/**
	 * @return the supermercado
	 */
	public Supermercado getSupermercado() {
		return supermercado;
	}

	/**
	 * @return the cnpjComerciante
	 */
	public String getCnpjComerciante() {
		return cnpjComerciante;
	}

	/**
	 * @param cnpjComerciante the cnpjComerciante to set
	 */
	public void setCnpjComerciante(String cnpjComerciante) {
		this.cnpjComerciante = cnpjComerciante;
	}
}
