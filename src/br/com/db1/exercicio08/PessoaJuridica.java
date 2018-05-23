package br.com.db1.exercicio08;

public class PessoaJuridica extends Pessoa {

	private Integer cnpj;

	public Boolean validaCnpj() {
		return null;
	}

	public String formataCnpj() {
		return "";
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

}
