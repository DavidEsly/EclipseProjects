package br.com.dtech;

public class Main {

	public static void main(String[] args) {

		Conta contaDavid = new Conta();
		contaDavid.abrirConta(916, 12001, "CP", "David Esly");
		contaDavid.depositar(300);

		contaDavid.statusConta();
		System.out.println("#############################");
		Conta contaGabi = new Conta();
		contaGabi.abrirConta(916, 12002, "CC", "Gabriela Layme");
		contaGabi.depositar(1000);
		contaGabi.statusConta();
		contaGabi.transferir(200, contaDavid);
		System.out.println("#############################");
		System.out.println("Saldo David: " + contaDavid.getSaldo());
		System.out.println("Saldo Gabi: " + contaGabi.getSaldo());
		
		contaDavid.sacar(650.0);
		System.out.println("Saldo David: " + contaDavid.getSaldo());
		
		contaDavid.fecharConta();
		contaDavid.statusConta();
		
		contaGabi.transferir(200, contaDavid);
		contaGabi.statusConta();
		contaDavid.statusConta();
	}

}
