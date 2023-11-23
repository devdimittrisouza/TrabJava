package Classe;

public class DemaisProdutoDto {

	private String fabricante;
	private int quantidade;
	
	public DemaisProdutoDto(String fabricante, int quantidade) {
		// TODO Auto-generated constructor stub
		this.fabricante = fabricante;
		this.quantidade = quantidade;
	}
	
	//Getter
	public String getFabricante() {
		
		return fabricante;
	}
	
	public int getQuantidade() {
		
		return quantidade;
	}
	
	//Setter
	public void setFabricante(String fabricante) {
		
		this.fabricante = fabricante;
	}
	
	public void setQuantidade(int quantidade) {
		
		this.quantidade = quantidade;
	}
}
