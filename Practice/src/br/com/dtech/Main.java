package br.com.dtech;

public class Main {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		Tecnico t = new Tecnico();

		g.setNome("David Esly");
		g.setSalario(5000);
		g.getBonificacao();
		
		t.setNome("Bruce");
		t.setSalario(5000);
		

		Controller c = new Controller();

		System.out.println(c.totBonificacao(g));
		System.out.println(c.totBonificacao(t));

	}

}
