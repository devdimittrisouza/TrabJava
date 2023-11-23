package Classe;

public class EnderecoDto {

	public int cep;
	public String endereco;
	public int numero;
	public String referencia;
	
	public EnderecoDto(int cep, String endereco, int numero, String referencia) {
		
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.referencia = referencia;
	}
	
	//Getter
	public int getCep() {
		
		return cep;
	}
	
	public String getEndereco() {
		
		return endereco;
	}
	
	public int getNumero() {
		
		return numero;
	}
	
	public String getReferencia() {
		
		return referencia;
	}
	
	//Setter
	public void setCep(int cep) {
		
		this.cep = cep;
	}
	
	public void setEndereco(String endereco) {
		
		this.endereco = endereco;
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
	}
	
	public void setReferencia(String referencia) {
		
		this.referencia = referencia;
	}
}
