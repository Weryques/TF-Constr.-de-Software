/**
 * 
 */
package br.com.mercadofacil.modelo;

/**
 * @author weryquessantos
 *
 */
public class Consumidor extends Usuario{
	private String cpfCliente;

	/**
	 * @return the cpfCliente
	 */
	public String getCpfCliente() {
		return cpfCliente;
	}

	/**
	 * @param cpfCliente the cpfCliente to set
	 */
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
}
