package br.com.dtech;

public class Gerente extends Funcionario {

	
	public double getBonificacao() {

		return super.getBonificacao() + this.getSalario();

	}

}
