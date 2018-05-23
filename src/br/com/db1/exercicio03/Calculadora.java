package br.com.db1.exercicio03;

public class Calculadora {

	private Double resultado;
	private Double primeiroValor;
	private Double segundoValor;

	public Calculadora() {
	}

	public Double somar(Double valor1, Double valor2) {
		return valor1 + valor2;
	}

	public Double subtrair(Double valor1, Double valor2) {
		return valor1 - valor2;
	}

	public Double dividir(Double valor1, Double valor2) {
		return valor1 / valor2;
	}

	public Double multiplicar(Double valor1, Double valor2) {
		return valor1 * valor2;
	}

	public Double exibirResultado() {
		return null;
	}

}