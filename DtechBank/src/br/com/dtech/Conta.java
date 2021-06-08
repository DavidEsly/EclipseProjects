package br.com.dtech;

public class Conta {

	private int ag;
	private int num;
	private String tipo;
	private double saldo;
	private String nome;
	private boolean status;

	public Conta() {
		this.saldo = 0.0;
		this.status = false;
	}

	public void statusConta() {
		System.out.println("Agência: " + this.getAg() + "\n" + "Número da conta: " + this.getNum() + "\n"
				+ "Tipo da conta: " + this.getTipo() + "\n" + "Titular: " + this.getNome() + "\n" + "Saldo: "
				+ this.getSaldo() + "\n" + "Status da conta: " + this.isStatus());
	}

	public int getAg() {
		return ag;
	}

	public int getNum() {
		return num;
	}

	public String getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public boolean isStatus() {
		return status;
	}

	public void abrirConta(int ag, int num, String tipo, String nome) {
		this.ag = ag;
		this.num = num;
		this.tipo = tipo;
		this.nome = nome;
		this.status = true;
		if (tipo == "CP" || tipo == "cp") {
			this.saldo += 150.0;
		} else if (tipo == "CC" || tipo == "cc") {
			this.saldo += 50.0;
		}

	}

	public void fecharConta() {
		if (this.saldo == 0) {
			this.status = false;
		} else if (this.saldo < 0) {
			System.out
					.println("A conta só poderá ser encerrado após o pagamento do saldo devedor R$" + this.getSaldo());
		} else {
			System.out.println(
					"Para poder encerrar a conta você precisa deixa-la com saldo zerado, valor ainda na conta R$"
							+ this.getSaldo());
		}

	}

	public void pagarMensalidade() {
		if (this.isStatus()) {
			if (tipo == "CP" || tipo == "cp") {
				this.saldo -= 20.0;
			} else if (tipo == "CC" || tipo == "cc") {
				this.saldo += 12.0;
			}
		} else {
			System.out.println("Conta fechada!");
		}

	}

	public void depositar(double valor) {
		if (valor > 0 && this.status == true) {
			this.saldo += valor;
		}
	}

	public boolean sacar(double valor) {
		if (valor > 0 && this.saldo >= valor && this.status == true) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void transferir(double valor, Conta acc) {
		if (this.getSaldo() >= valor && acc.isStatus()) {
			acc.depositar(valor);
			this.saldo -= valor;

		} else {
			System.out.println("Conta de destino encontra-se encerrada");

		}
	}

}
