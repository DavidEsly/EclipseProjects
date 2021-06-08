package br.com.dtech;

public class Lista {

	private Usuario u;
	private Produto p;
	private int quantidade;
	private double valTot = 0;
	private double val;

	public Lista(Usuario u, Produto p, int quantidade) {
		this.u = u;
		this.p = p;
		this.quantidade = quantidade;
		this.setValTot(this.p, this.quantidade);

	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public Produto getP() {
		return p;
	}

	public void setP(Produto p) {
		this.p = p;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValTot() {
		return valTot;
	}

	public double setValTot(Produto valTot, int num) {
		val = valTot.getValor() * num;
		return this.valTot += val;

	}

	@Override
	public String toString() {
		return "Lista [u=" + u + ", p=" + p + ", quantidade=" + quantidade + "]";
	}

}
