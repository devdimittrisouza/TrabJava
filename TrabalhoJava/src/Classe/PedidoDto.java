package Classe;

import java.util.Date;

public class PedidoDto implements Cloneable {

	private int numPedido;
	private Date dataCompra;
	private Double valorFrete;
	private String nomeCliente;
	private int numCliente;
	private String status;
	private String formaPagamento;
	private int valor;

	public PedidoDto() {
		// TODO Auto-generated constructor stub
	}

	public PedidoDto(int numPedido, Date dataCompra, Double valorFrete, String nomeCliente, int numCliente,
			String status, String formaPagamento, int valor) {
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

	public PedidoDto clonar() {
		// Utilize o construtor ou método de criação com parâmetros para criar uma cópia
		return new PedidoDto(this.numPedido, this.dataCompra, this.valorFrete, this.nomeCliente, this.numCliente,
				this.status, this.formaPagamento, this.valor);
	}

	// Getter
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

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	/*
	 * // Método clone para aplicar o padrão Prototype public PedidoDto
	 * pedirNovamente() { return new PedidoDto( this.numPedido, this.dataCompra,
	 * this.valorFrete, this.nomeCliente, this.numCliente, this.status,
	 * this.formaPagamento, this.valor ); }
	 */

	public PedidoDto pedirNovamente() {
		try {
			return (PedidoDto) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	// Exemplo de uso
	public static void main(String[] args) {
		PedidoDto pedidoOriginal = new PedidoDto(1, new Date(), 10.0, "Cliente1", 123, "Em andamento",
				"Cartão de Crédito", 100);
		PedidoDto pedidoClonado = pedidoOriginal.pedirNovamente();

		/*
		 * // Exibindo informações do pedido clonado
		 * System.out.println("Informações do Pedido Original:");
		 * System.out.println("Número do Pedido: " + pedidoOriginal.getNumPedido());
		 * System.out.println("Data da compra:  " + pedidoOriginal.getDataCompra());
		 * System.out.println("Valor do frete: " + pedidoOriginal.getValorFrete());
		 * System.out.println("Cliente: " + pedidoOriginal.getNomeCliente());
		 * System.out.println("Numero do Cliente: " + pedidoOriginal.getNumCliente());
		 * System.out.println("Status: " + pedidoOriginal.getStatus());
		 * System.out.println("Forma de Pagamento: " +
		 * pedidoOriginal.getFormaPagamento()); System.out.println("Valor: " +
		 * pedidoOriginal.getValor());
		 * 
		 * System.out.println("\nInformações do Pedido Clonado:");
		 * System.out.println("Número do Pedido: " + pedidoClonado.getNumPedido());
		 * System.out.println("Data da compra:  " + pedidoClonado.getDataCompra());
		 * System.out.println("Valor do frete: " + pedidoClonado.getValorFrete());
		 * System.out.println("Cliente: " + pedidoClonado.getNomeCliente());
		 * System.out.println("Numero do Cliente: " + pedidoClonado.getNumCliente());
		 * System.out.println("Status: " + pedidoClonado.getStatus());
		 * System.out.println("Forma de Pagamento: " +
		 * pedidoClonado.getFormaPagamento()); System.out.println("Valor: " +
		 * pedidoClonado.getValor());
		 */

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return "Número do Pedido: " + numPedido + "\nData da compra: " + dataCompra + "\nValor do frete: " + valorFrete
				+ "\nCliente: " + nomeCliente + "\nNumero do Cliente: " + numCliente + "\nStatus: " + status
				+ "\nForma de Pagamento: " + formaPagamento + "\nValor: " + valor;
	}

}
