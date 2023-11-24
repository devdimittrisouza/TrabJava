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
		
		
		if(username == "admin" && senha == "123") {
			
			System.out.println("Login realizado com sucesso!");
		} else {
			System.out.println("Falha ao realizar login!");
		}
		
		
		System.out.println(username);
		System.out.println(senha);
	}

}
