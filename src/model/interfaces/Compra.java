package model.interfaces;

public interface Compra {
	Double getValorTotal();
	void finalizarCompra();
	void verCompra();
	void adicionarProduto();
	void removerProduto();
}
