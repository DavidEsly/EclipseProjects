package br.com.dtech;

public class Main {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.ligarMudo();
		c.ligarMudo();
		c.play();
		c.abrirMenu();

	}

}
