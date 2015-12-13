/**
 * 
 */
package br.com.mercadofacil.modelo;

/**
 * @author weryquessantos
 *
 */
public class Anunciante extends Usuario{
	private String cnpjAnunciante;
	private String razaoSocial;
	
	/**
	 * @return the cnpjAnunciante
	 */
	public String getCnpjAnunciante() {
		return cnpjAnunciante;
	}
	/**
	 * @param cnpjAnunciante the cnpjAnunciante to set
	 */
	public void setCnpjAnunciante(String cnpjAnunciante) {
		this.cnpjAnunciante = cnpjAnunciante;
	}
	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}
	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
