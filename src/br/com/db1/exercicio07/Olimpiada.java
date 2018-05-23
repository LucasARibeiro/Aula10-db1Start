package br.com.db1.exercicio07;

public class Olimpiada {

	private Integer ano;
	private Modalidade modalidade;
	private Pessoa pessoa;
	private Sede sede;

	public Olimpiada(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Olimpiada(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Olimpiada(Sede sede) {
		this.sede = sede;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
}
