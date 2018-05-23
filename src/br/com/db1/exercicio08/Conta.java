package br.com.db1.exercicio08;

public class Conta {

	private Integer numero;
	private Integer digitoVerificador;
	private Agencia agencia;
	private Pessoa pessoa;

	public Conta() {
		
	}
	
	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	public Conta(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void calcularDigitoVerificador() {
	}

	public void validaDigitoVerificador() {
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

}
