package Classe;

public class ProdutoDto {

	private int codigo;
	private String nome;
	private String categoria;
	private int preco;

	public ProdutoDto(int codigo, String nome, String categoria, int preco) {
		// TODO Auto-generated constructor stub

		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
	
	//Getter
	public int getCodigo() {
		
		return codigo;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public String getCategoria() {
		
		return categoria;
	}
	
	public int getPreco() {
		
		return preco;
	}
	
	//Setter
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public void setCategoria(String categoria) {
		
		this.categoria = categoria;
	}
	
	public void setPreco(int preco) {
		
		this.preco = preco;
	}
}
