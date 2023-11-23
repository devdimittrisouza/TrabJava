package Classe;

public class ClienteDto {

	private int cpf;
	private int telefone;
	private String email;
	private int numCliente;
	
	public ClienteDto(int cpf, int telefone, String email, int numCliente) {
		
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.numCliente = numCliente;
	}
	
	//Getters
	public int getCpf() {
		
		return cpf;
	}
	
	public int getTelefone() {
		
		return telefone;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public int getNumCliente() {
		
		return numCliente;
	}
	
	//Setters
	public void setCpf(int cpf) {
		
		this.cpf = cpf;
	}
	
	public void setTelefone(int telefone) {
		
		this.telefone = telefone;
	}
	
	public void setEmail (String email) {
		
		this.email = email;
	}
	
	public void setNumCliente(int numCliente) {
		
		this.numCliente = numCliente;
	}
	
}
