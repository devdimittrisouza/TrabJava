package Classe;

public class UsuarioDto {

	private String nome;
	private String login;
	private String senha;

	// Criando o construtor da classe
	public UsuarioDto(String nome, String login, String senha) {

		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	// Getters e Setters

	public String getNome() {

		return nome;
	}

	public String getLogin() {

		return login;
	}

	public String getSenha() {

		return senha;
	}

	// Setters
	public void setNome(String nome) {

		this.nome = nome;
	}

	public void setLogin(String login) {

		this.login = login;
	}

	public void setSenha(String senha) {

		this.senha = senha;
	}
}

 
