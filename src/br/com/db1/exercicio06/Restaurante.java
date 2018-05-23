package br.com.db1.exercicio06;

import java.util.Date;
import java.util.List;

public class Restaurante {

	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafedaManha;
	private Endereco endereco;
	private List<Telefone> telefone;
	private List<Pedido> pedido;

	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJantar() {
		return serveJantar;
	}

	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}

	public Boolean getServeCafedaManha() {
		return serveCafedaManha;
	}

	public void setServeCafedaManha(Boolean serveCafedaManha) {
		this.serveCafedaManha = serveCafedaManha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

}
