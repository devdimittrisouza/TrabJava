package Logica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo a tela de login!");

		System.out.print("Digite seu usuario: ");
		String username = scanner.nextLine();

		System.out.print("Digite sua senha: ");
		String senha = scanner.nextLine();

		if ("admin".equals(username) && "123".equals(senha)) {

			System.out.println("Login realizado com sucesso!\n");

			int opcao;
			do {
				System.out.println("Menu Principal");
				System.out.println("1- Pizzas");
				System.out.println("0- Sair\n");

				System.out.print("Escolha uma opcao: \n");
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					exibirMenuPizzas();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Favor digitar uma opcao valida");
				}

			} while (opcao != 0);
		} 
		else if("user".equals(username) && "123".equals(senha)) {
			
			System.out.println("Logado como usuario padrao!\n");
			
		} else {
			System.out.println("Falha ao realizar login!");
		}
		
		
	}

	private static void exibirMenuPizzas() {
		System.out.println("\nMenu Pizzas:");
		System.out.println("1- Pizza de Calabresa");
		System.out.println("2- Pizza Margherita");
		System.out.println("3- Pizza Quatro Queijos");
		System.out.println("4- Carrinho");
		System.out.println("5- Historico de pedidos");
		System.out.println("0- Voltar");

		Scanner scanner = new Scanner(System.in);
		
		int opcaoPizza;
		
		do {
			System.out.print("Escolha uma opcao: ");
			opcaoPizza = scanner.nextInt();

			switch (opcaoPizza) {
			case 1:
				System.out.println("Você escolheu a Pizza de Calabresa!");
				break;
			case 2:
				System.out.println("Você escolheu a Pizza Margherita!");
				break;
			case 3:
				System.out.println("Você escolheu a Pizza Quatro Queijos!");
				break;
			case 4:
				System.out.println("Abrindo carrinho");
				break;
			case 5:
				System.err.println("Abrindo historico");
				break;
			case 0:
				System.out.println("Voltando ao Menu Principal.");
				break;
			default:
				System.out.println("Favor digitar uma opcao valida");
			}

		} while (opcaoPizza != 0);
	}

}
