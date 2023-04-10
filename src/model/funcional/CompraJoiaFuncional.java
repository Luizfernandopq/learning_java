package model.funcional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.interfaces.Cliente;
import model.interfaces.Compra;
import model.interfaces.Produto;

public class CompraJoiaFuncional implements Compra {

	private List<Produto> produtos;
	private Cliente cliente;
	private LocalDate momentoCompra;
	private static int codigoCompraAutoIncrement=0;
	private int codigoCompra;

	public CompraJoiaFuncional(Cliente cliente) {
		this.cliente = cliente;
		this.momentoCompra = LocalDate.now();
		this.produtos = new ArrayList<Produto>();
		this.codigoCompra = CompraJoiaFuncional.codigoCompraAutoIncrement;
		CompraJoiaFuncional.codigoCompraAutoIncrement++;
	}
	
	public int getCodigoCompra() {
		return codigoCompra;
	}

	public void setCodigoCompra(int codigoCompra) {
		this.codigoCompra = codigoCompra;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public LocalDate getMomentoCompra() {
		return momentoCompra;
	}
	
	public void setMomentoCompra(LocalDate momentoCompra) {
		this.momentoCompra = momentoCompra;
	}
	
	@Override
	public Double getValorTotal() {
		Double valorComprado = 0.0;
		for (Produto produto : this.produtos) {
			valorComprado += produto.getValor();
		}
		return valorComprado;
	}

	@Override
	public void finalizarCompra() {
		this.setMomentoCompra(LocalDate.now());
		this.cliente.adicionarCompra(this);
	}

	@Override
	public void verCompra() {
		System.out.println("MomentoCompra=" + momentoCompra + "]");
		for (Produto p : this.produtos) {
			p.verProduto();
		}
	}

	@Override
	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}

	@Override
	public void removerProduto(Produto produto) {
		this.produtos.remove(produto);
	}
	
}
