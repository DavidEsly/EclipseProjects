package br.com.dtech;

public abstract class Animal {

	private int idade;
	private double peso;
	private int membros;
	private String comendo;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

	public String getComendo() {
		return comendo;
	}

	public void setComendo(String comendo) {
		this.comendo = comendo;
	}

	public void comer() {
		this.setComendo("Comendo algo");
	}
	public abstract void emitirSom();
}
