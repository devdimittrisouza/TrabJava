package Classe;

import java.util.Date;

public class PedidoDto {

	private int numPedido;
	private Date dataCompra;
	private Double valorFrete;
	private String nomeCliente;
	private int numCliente;
	private String status;
	private String formaPagamento;
	private int valor;
	
	public PedidoDto(int numPedido, Date dataCompra, Double valorFrete, String nomeCliente, int numCliente, String status, String formaPagamento, int valor) {
		// TODO Auto-generated constructor stub
		this.numPedido = numPedido;
		this.dataCompra = dataCompra;
		this.valorFrete = valorFrete;
		this.nomeCliente = nomeCliente;
		this.numCliente = numCliente;
		this.status = status;
		this.formaPagamento = formaPagamento;
		this.valor = valor;
	}
	
	//Getter
	public int getNumPedido() {
		
		return numPedido;
	}
	
	public Date getDataCompra() {
		
		return dataCompra;
	}
	
	public Double getValorFrete() {
		
		return valorFrete;
	}
	
	public String getNomeCliente() {
		
		return nomeCliente;
	}
	
	public int getNumCliente() {
		
		return numCliente;
	}
	
	public String getStatus() {
		
		return status;
	}
	
	public String getFormaPagamento() {
		
		return formaPagamento;
	}
	
	public int getValor() {
		
		return valor;
	}
}
