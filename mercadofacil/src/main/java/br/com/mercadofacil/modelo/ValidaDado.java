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
		
		if (cpf == null || cpf.length() != 11 || cpf.matches("^(0{11}|1{11}|2{11}|3{11}|4{11}|5{11}|6{11}|7{11}|9{11}|9{11})$")){
			resultado = false;
		}
		else{
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
			
			if(digitoComparador != digitoVerificador1){
				return resultado;
			}
			else{
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
		}
		
		return resultado;
	}
}
