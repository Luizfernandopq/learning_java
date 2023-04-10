package model.classes;

import java.text.DecimalFormat;

import model.interfaces.Produto;

public class ProdutoJoia implements Produto {
	
	private String nome;
	private String descricao;
	private Double valor;
	
	
	public ProdutoJoia(String nome, String descricao, Double valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public void verProduto() {
		DecimalFormat f = new DecimalFormat("#.##");
		System.out.println("Nome: " + nome + "\nValor: " + f.format(valor) + "\n");
	}

	@Override
	public Double getValor() {
		return this.valor;
	}

}
