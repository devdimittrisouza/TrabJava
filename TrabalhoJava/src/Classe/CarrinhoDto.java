package Classe;

public class CarrinhoDto {

	private String nomeProduto;
	private int quantidade;
	private Double valor;
	private String observacao;

	public CarrinhoDto(String nomeProduto, int quantidade, Double valor, String observacao) {

		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.observacao = observacao;
	}
	
	//Getter
	public String getNomeProduto() {
		
		return nomeProduto;
	}
	
	public int getQuantidade() {
		
		return quantidade;
	}
	
	public Double getValor() {
		
		return valor;
	}
	
	public String getObservacao() {
		
		return observacao;
	}
	
	//Setter
	public void setNomeProduto(String nomeProduto) {
		
		this.nomeProduto = nomeProduto;
	}
	
	public void setQuantidade(int quantidade) {
		
		this.quantidade = quantidade;
	}
	
	public void setValor(Double valor) {
		
		this.valor = valor;
	}
	
	public void setObservacao(String observacao) {
		
		this.observacao = observacao;
	}
}
