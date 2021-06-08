package br.com.dtech;

public class Main {

	public static void main(String[] args) {
		Video v[] = new Video[3];

		v[0] = new Video("Aula 01");
		v[1] = new Video("Aula 02");
		v[2] = new Video("Aula 03");

		Gafanhoto g[] = new Gafanhoto[2];

		g[0] = new Gafanhoto("David", 29, 'M', "david.silva");
		g[1] = new Gafanhoto("Bruce", 3, 'M', "bruce.wayne");

		//System.out.println(v[0].toString());

		Visualizacao w = new Visualizacao(g[0], v[2]);
		System.out.println(w.toString());
	}

}
