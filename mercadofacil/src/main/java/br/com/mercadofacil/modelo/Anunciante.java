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
	private String causa;
	
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
	/**
	 * @return the causa
	 */
	public String getCausa() {
		return causa;
	}
	/**
	 * @param causa the causa to set
	 */
	public void setCausa(String causa) {
		this.causa = causa;
	}
}
