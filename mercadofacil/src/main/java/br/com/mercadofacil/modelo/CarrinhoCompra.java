/**
 * 
 */
package br.com.mercadofacil.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weryquessantos
 *
 */
public class CarrinhoCompra {
	private List<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();
	private Double total = 0.0;
	/**
	 * @return the itens
	 */
	public List<ItemCarrinho> getItens() {
		return itens;
	}
	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<ItemCarrinho> itens) {
		this.itens = itens;
	}
	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
}
