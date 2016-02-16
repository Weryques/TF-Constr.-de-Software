/**
 * 
 */
package br.com.mercadofacil.modelo;

/**
 * @author weryquessantos
 *
 */
public class ValidaDado {
	private static final int[] pesoCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
	
	public boolean validarCPF(String cpf){
		boolean resultado = false;


		int digitoVerificador1 = 0, digitoVerificador2 = 0;
		int digito = 0;
		int sequencia = 10, soma = 0;

		digitoVerificador1 = (int) (cpf.charAt(12) - 48);
		digitoVerificador2 = (int) (cpf.charAt(13) - 48);

		//calcular o primeiro digito verificador
		for(int i = 0; i < 11; i++){
			if(cpf.charAt(i) != '.'){
				digito = (int) (cpf.charAt(i) - 48);

				soma = soma + (digito * sequencia);
				sequencia--;
			}
		}

		int resto = 0, digitoComparador = 0;

		resto = soma % 11;

		if(resto < 2){
			digitoComparador = 0;
		}
		else if(resto >= 2){
			digitoComparador = 11 - resto;
		}
		
		sequencia = 11;
		soma = 0;
		
		if(digitoComparador == digitoVerificador1){		
			//calcular o segundo digito verificador
			for(int i = 0; i < 13; i++){
				if(cpf.charAt(i) != '.' && cpf.charAt(i) != '-'){
					digito = (int) (cpf.charAt(i) - 48);

					soma = soma + (digito * sequencia);
					sequencia--;
				}
			}

			resto = soma % 11;

			if(resto < 2){
				digitoComparador = 0;
			}
			else if(resto >= 2){
				digitoComparador = 11 - resto;
			}

			if(digitoComparador == digitoVerificador2){
				resultado = true;
			}
		}

		return resultado;
	}
	
	private static int calcularDigito(String str, int[] peso) {
	      int soma = 0;
	      for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
	         digito = Integer.parseInt(str.substring(indice,indice+1));
	         soma += digito*peso[peso.length-str.length()+indice];
	      }
	      soma = 11 - soma % 11;
	      return soma > 9 ? 0 : soma;
	   }


	public boolean validarCNPJ(String cnpj){
		if ((cnpj==null)||(cnpj.length()!=14)) return false;

	      Integer digito1 = calcularDigito(cnpj.substring(0,12), pesoCNPJ);
	      Integer digito2 = calcularDigito(cnpj.substring(0,12) + digito1, pesoCNPJ);
	      return cnpj.equals(cnpj.substring(0,12) + digito1.toString() + digito2.toString());
	}
}
