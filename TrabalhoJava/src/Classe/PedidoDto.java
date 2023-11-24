package Classe;

import java.util.Date;

public class PedidoDto {

	private int numPedido;
	private String dataCompra;
	private Double valorFrete;
	private String nomeCliente;
	private int numCliente;
	private String status;
	private String formaPagamento;
	private int valor;
	
	public PedidoDto(int numPedido, String dataCompra, Double valorFrete, String nomeCliente, int numCliente, String status, String formaPagamento, int valor) {
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
	
	public String getDataCompra() {
		
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
	
	// Método clone para aplicar o padrão Prototype
    public PedidoDto pedirNovamente() {
        return new PedidoDto(
                this.numPedido,
                this.dataCompra,
                this.valorFrete,
                this.nomeCliente,
                this.numCliente,
                this.status,
                this.formaPagamento,
                this.valor
        );
    }

    // Exemplo de uso
    public static void main(String[] args) {
    	PedidoDto pedidoOriginal = new PedidoDto (1, "2023-11-23", 10.9, "Cliente Teste", 123, "Em andamento", "Cartão de Crédito", 100);
    	PedidoDto pedidoClonado = pedidoOriginal.pedirNovamente();

        // Exibindo informações do pedido clonado
        System.out.println("Informações do Pedido Original:");
        System.out.println("Número do Pedido: " + pedidoOriginal.getNumPedido());
        System.out.println("Cliente: " + pedidoOriginal.getNomeCliente());

        System.out.println("\nInformações do Pedido Clonado:");
        System.out.println("Número do Pedido: " + pedidoClonado.getNumPedido());
        System.out.println("Cliente: " + pedidoClonado.getNomeCliente());
    }
}
 