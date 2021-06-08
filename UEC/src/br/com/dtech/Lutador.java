package br.com.dtech;

public class Lutador implements Luta {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	private double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
		// this.setCategoria();

	}

	private String getCategoria() {
		return categoria;
	}

	private void setCategoria(String categoria) {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}

	@Override
	public void apresentar() {
		System.out.println("--------Apresentação-------");
		System.out.println("Lutador: " + this.getNome() + "\n" + "Origem: " + this.getNacionalidade() + "\n" + "Idade: "
				+ this.getIdade() + " anos" + "\n" + "Altura: " + this.getAltura() + "m \n" + "Pesando: "
				+ this.getPeso() + "Kg \n" + "Vitórias: " + this.getVitorias() + "\n" + "Derrotas: "
				+ this.getDerrotas() + "\n" + "Empates: " + this.getEmpates());

	}

	@Override
	public void status() {
		System.out.println("-------Status-------");
		System.out.println("Nome: " + this.getNome() + "\n" + "é um peso: " + this.getCategoria() + "\n" + "vitórias: "
				+ this.getVitorias() + "\n" + "derrotas: " + this.getDerrotas() + "\n" + "empates: "
				+ this.getEmpates());

	}

	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);

	}

	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);

	}

	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);

	}

}
