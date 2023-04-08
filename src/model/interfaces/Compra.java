package model.interfaces;

public interface Compra {
	Double getValorTotal();
	void finalizarCompra();
	void verCompra();
	void adicionarProduto(Produto produto);
	void removerProduto(Produto produto);
}
