/**
 * 
 */
package br.com.mercadofacil.modelo;

/**
 * @author weryquessantos
 *
 */
public class ValidaDado {
	public boolean validarCPF(String cpf){
		boolean resultado = false;


		int digitoVerificador1 = 0, digitoVerificador2 = 0;
		int digito = 0;
		int sequencia = 10, soma = 0;

		digitoVerificador1 = (int) (cpf.charAt(13) - 48);
		digitoVerificador2 = (int) (cpf.charAt(14) - 48);

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

		if(digitoComparador == digitoVerificador1){		
			//calcular o segundo digito verificador
			for(int i = 0; i < 13; i++){
				if(cpf.charAt(i) != '.' || cpf.charAt(i) != '-'){
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

	public boolean validarCNPJ(String cnpj){
		boolean resultado = false;

		int digitoVerificador1, digitoVerificador2;
		int digito;
		int soma = 0, j = 0, k = 0;

		digitoVerificador1 = (int) (cnpj.charAt(17) - 48);
		digitoVerificador2 = (int) (cnpj.charAt(18) - 48);

		//calculo do primeiro digito
		j = 5;
		k = 9;
		for(int i = 0; i < 15; i++){
			if(cnpj.charAt(i) != '.' || cnpj.charAt(i) != '/' || cnpj.charAt(i) != '-'){
				digito = (int) (cnpj.charAt(i) - 48);

				if(i < 4){
					soma += digito * j;
					j--;
					if(j == 2){
						j = 5;
					}
				}
				else if(i > 3 && i < 8){
					soma += digito * k;
					k--;
				}
				else if(i >= 8){
					soma += digito * j;
					j--;
				}
			}
		}

		int resto, digitoComparador;

		resto = soma % 11;

		if(resto < 2){
			digitoComparador = 0;
		}
		else{
			digitoComparador = 11 - resto;
		}

		if(digitoComparador == digitoVerificador1){		
			//calculo do segundo digito
			j = 6;
			k = 9;
			soma = 0;
			for(int i = 0; i < 17; i++){
				if(cnpj.charAt(i) != '.' || cnpj.charAt(i) != '/' || cnpj.charAt(i) != '-'){
					digito = (int) (cnpj.charAt(i) - 48);

					if(i < 5){
						soma += digito * j;
						j--;
					}
					else if(i > 4 && i < 13){
						soma += digito * k;
						k--;
					}
				}
			}

			resto = soma % 11;

			if(resto < 2){
				digitoComparador = 0;
			}
			else{
				digitoComparador = 11 - resto;
			}

			if(digitoComparador == digitoVerificador2){
				resultado = true;
			}
		}

		return resultado;
	}
}
