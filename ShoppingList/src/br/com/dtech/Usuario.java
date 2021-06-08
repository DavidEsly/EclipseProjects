package br.com.dtech;

public class Usuario extends Pessoa {

	private String login;
	private String senha;

	public Usuario(String nome, String sobrenome, int idade, String login, String senha) {

		super(nome, sobrenome, idade);
		this.login = nome;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	private String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean autentica(String senha) {
		if (this.getSenha().equals(senha)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Usuario [" + super.toString() + "login=" + login + ", senha=" + senha + "]";
	}

}
