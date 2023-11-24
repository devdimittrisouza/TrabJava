package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	private static Scanner scanner = new Scanner(System.in);
	private static String usuarioPadrao = "admin";
	private static String senhaPadrao = "123";
	private static boolean loggedIn = false;
	private static List<String> carrinho = new ArrayList<>();
	private static List<String> historicoPedidos = new ArrayList<>();

	public static void main(String[] args) {
		exibirMenuInicial();
	}

	private static void exibirMenuInicial() {
		int opcao;
		do {
			System.out.println("\nOpções:");
			System.out.println("1- Login");
			System.out.println("2- Cadastro");
			System.out.println("0- Sair");

			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				realizarLogin();
				break;
			case 2:
				realizarCadastro();
				break;
			case 0:
				System.out.println("Saindo da aplicação. Até logo!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 0);
	}

	private static void realizarLogin() {
		System.out.print("Digite o usuário: ");
		String usuario = scanner.next();

		System.out.print("Digite a senha: ");
		String senha = scanner.next();

		if (usuario.equals(usuarioPadrao) && senha.equals(senhaPadrao)) {
			loggedIn = true;
			System.out.println("Login realizado com sucesso!");
			exibirMenuPrincipal();
		} else {
			System.out.println("Usuário ou senha incorretos. Tente novamente.");
		}
	}

	private static void realizarCadastro() {
		System.out.print("Digite o CPF: ");
		String cpf = scanner.next();

		System.out.print("Digite o telefone: ");
		String telefone = scanner.next();

		System.out.print("Digite o email: ");
		String email = scanner.next();

		System.out.print("Digite a senha: ");
		String senha = scanner.next();

		System.out.print("Confirme a senha: ");
		String confirmarSenha = scanner.next();

		if (senha.equals(confirmarSenha)) {
			System.out.println("Cadastro realizado com sucesso!");
			loggedIn = true;
			exibirMenuPrincipal();
		} else {
			System.out.println("As senhas não coincidem. Tente novamente.");
		}
	}

	private static void exibirMenuPrincipal() {
		if (loggedIn) {
			int opcao;
			do {
				System.out.println("\nMenu Principal:");
				System.out.println("1- Pizzas");
				System.out.println("2- Refrigerantes");
				System.out.println("3- Carrinho");
				System.out.println("4- Histórico de Pedidos");
				System.out.println("0- Sair");

				System.out.print("Escolha uma opção: ");
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					exibirMenuPizzas();
					break;
				case 2:
					exibirMenuRefrigerantes();
					break;
				case 3:
					exibirCarrinho();
					break;
				case 4:
					exibirHistoricoPedidos();
					break;
				case 0:
					System.out.println("Saindo do menu principal. Até logo!");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}

			} while (opcao != 0);
		} else {
			System.out.println("Você precisa fazer login ou cadastro primeiro.");
		}
	}

	private static void exibirMenuPizzas() {
		int opcao;
		do {
			System.out.println("\nMenu de Pizzas:");
			System.out.println("1- Portuguesa");
			System.out.println("2- Peperoni");
			System.out.println("3- Costela");
			System.out.println("4- Voltar");

			System.out.print("Escolha uma pizza: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				exibirDetalhesPizza("Portuguesa", 50.0);
				break;
			case 2:
				exibirDetalhesPizza("Peperoni", 50.0);
				break;
			case 3:
				exibirDetalhesPizza("Costela", 50.0);
				break;
			case 4:
				System.out.println("Voltando ao menu principal.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 4);
	}

	private static void adicionarAoCarrinho(String nomeItem, double valorItem) {
		carrinho.add(nomeItem + " - R$" + valorItem);
		System.out.println("Item adicionado ao carrinho!");
	}

	private static void exibirDetalhesPizza(String nomePizza, double valorPizza) {
		int opcao;
		do {
			System.out.println("\nDetalhes de " + nomePizza + ":");
			System.out.println("Ingredientes");
			System.out.println("Valor: R$" + valorPizza);
			System.out.println("1- Adicionar ao Carrinho");
			System.out.println("2- Voltar");

			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				adicionarAoCarrinho(nomePizza, valorPizza);
				break;
			case 2:
				System.out.println("Voltando ao menu de pizzas.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 2);
	}

	private static void exibirMenuRefrigerantes() {
		int opcao;
		do {
			System.out.println("\nMenu de Refrigerantes:");
			System.out.println("1- Coca Cola");
			System.out.println("2- Guaraná");
			System.out.println("3- Voltar");

			System.out.print("Escolha um refrigerante: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				exibirDetalhesRefrigerante("Coca Cola", 5.0);
				break;
			case 2:
				exibirDetalhesRefrigerante("Guaraná", 5.0);
				break;
			case 3:
				System.out.println("Voltando ao menu principal.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 3);
	}

	private static void exibirDetalhesRefrigerante(String nomeRefrigerante, double valorRefrigerante) {
		int opcao;
		do {
			System.out.println("\nDetalhes de " + nomeRefrigerante + ":");
			System.out.println("Valor: R$" + valorRefrigerante);
			System.out.println("1- Adicionar ao Carrinho");
			System.out.println("2- Voltar");

			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				adicionarAoCarrinho(nomeRefrigerante, valorRefrigerante);
				break;
			case 2:
				System.out.println("Voltando ao menu de refrigerantes.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 2);
	}

	private static void exibirCarrinho() {
		int opcao;
		do {
			System.out.println("\nCarrinho:");

			if (carrinho.isEmpty()) {
				System.out.println("O carrinho está vazio.");
			} else {
				for (String item : carrinho) {
					System.out.println(item);
				}
			}

			System.out.println("1- Pagar");
			System.out.println("2- Excluir Tudo");
			System.out.println("3- Voltar");

			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				realizarPagamento();
				break;
			case 2:
				carrinho.clear();
				System.out.println("Carrinho esvaziado.");
				break;
			case 3:
				System.out.println("Voltando ao menu principal.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 3);
	}

	private static void realizarPagamento() {
		int opcao;
		do {
			System.out.println("\nFormas de Pagamento:");
			System.out.println("1- Cartão de Crédito");
			System.out.println("2- Pagar na Entrega");
			System.out.println("3- Cancelar Pedido");

			System.out.print("Escolha uma forma de pagamento: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				pagamentoCartaoCredito();
				break;
			case 2:
				System.out.println("Pedido realizado! Aguarde a entrega.");
				historicoPedidos.add(carrinho.toString());
				carrinho.clear();
				break;
			case 3:
				System.out.println("Pedido cancelado.");
				carrinho.clear();
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 2 && opcao != 3);
	}

	private static void pagamentoCartaoCredito() {
		System.out.println("\nPagamento com Cartão de Crédito:");

		System.out.print("Número do Cartão: ");
		String numeroCartao = scanner.next();

		System.out.print("Validade: ");
		String validade = scanner.next();

		System.out.print("CVC: ");
		String cvc = scanner.next();

		System.out.print("Nome do Titular: ");
		String nomeTitular = scanner.next();

		System.out.println("1- Confirmar");
		System.out.println("2- Cancelar Pedido");

		int opcao = scanner.nextInt();

		if (opcao == 1) {
			System.out.println("Pagamento realizado com sucesso! Aguarde a entrega.");
			historicoPedidos.add(carrinho.toString());
			carrinho.clear();
		} else {
			System.out.println("Pagamento cancelado.");
		}
	}

	private static void exibirHistoricoPedidos() {
		System.out.println("\nHistórico de Pedidos:");

		if (historicoPedidos.isEmpty()) {
			System.out.println("O histórico de pedidos está vazio.");
		} else {
			for (String pedido : historicoPedidos) {
				System.out.println(pedido);
			}
		}
	}
}
