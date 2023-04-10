package model.classes;

import java.util.ArrayList;
import java.util.List;

import model.interfaces.Cliente;
import model.interfaces.Compra;
import model.interfaces.Pagamento;

public class ClienteJoia implements Cliente {

	private int uniqueId;
	private List<Compra> compras;
	private List<Pagamento> pagamentos;
	private String nome;
	private String contato;
	
	
	public ClienteJoia(String nome, String contato) {
		this.compras = new ArrayList<>();
		this.pagamentos = new ArrayList<>();
		this.nome = nome;
		this.contato = contato;
	}

	/*
	 * Getters e Setters
	*/
	
	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	/*
	 * Overrides
	*/
	
	@Override
	public void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	@Override
	public void removerCompra(Compra compra) {
		this.compras.remove(compra);
	}

	@Override
	public void adicionarPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
	}

	@Override
	public void removerPagamento(Pagamento pagamento) {
		this.pagamentos.remove(pagamento);
	}

	@Override
	public Double verSaldo() {
		Double saldo = 0.0;
		for (Compra compra : this.compras) {
			saldo -= compra.getValorTotal();
		}
		for (Pagamento pagamento : this.pagamentos) {
			saldo += pagamento.getValor();
		}
		return saldo;
	}

	@Override
	public void verHistorico() {
		for (Compra compra : this.compras) {
			compra.verCompra();
		}
		for (Pagamento pagamento : this.pagamentos) {
			pagamento.verPagamento();
		}
	}

}
