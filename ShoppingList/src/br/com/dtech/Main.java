package br.com.dtech;

public class Main {

	public static void main(String[] args) {
		Usuario user[] = new Usuario[3];

		user[0] = new Usuario("David", "Silva", 29, "david.silva", "D@v5d2#sly");
		user[1] = new Usuario("Gabi", "Layme", 35, "gabi.layme", "1234567");
		user[2] = new Usuario("Bruce", "Wayne", 3, "bruce.wayne", "d2v5d2");

		Produto products[] = new Produto[6];
		products[0] = new Produto("Pão", 5.20, "Padaria");
		products[1] = new Produto("Bolo", 11, "Padaria");
		products[2] = new Produto("Carne", 42.38, "Frigorífico");
		products[3] = new Produto("Salsicha", 7.00, "Frigorífico");
		products[4] = new Produto("Macarrão", 3.8, "Massas");
		products[5] = new Produto("Biscoito Recheado", 2.50, "Biscoitos");

		Lista list[] = new Lista[3];
		list[0] = new Lista(user[0], products[3], 3);
		list[0] = new Lista(user[0], products[5], 4);
		list[0] = new Lista(user[0], products[2], 2);

		

		list[1] = new Lista(user[1], products[2], 3);
		list[1] = new Lista(user[1], products[4], 2);
		list[1] = new Lista(user[1], products[1], 1);

		System.out.println(list[0].toString());
		System.out.println("Valor total: " + list[0].getValTot());
		
		System.out.println(list[1].toString());
		System.out.println("Valor total: " + list[1].getValTot());

	}

}
