package br.com.dtech;

public class Controller {

	private double soma;

	private double getSoma() {
		return soma;
	}

	private void setSoma(double soma) {
		this.soma = soma;
	}

	public double totBonificacao(Funcionario f) {
		this.setSoma(this.getSoma() + f.getBonificacao());
		return this.getSoma();
	}
}
