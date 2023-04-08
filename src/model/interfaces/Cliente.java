package model.interfaces;

public interface Cliente {
	
	void adicionarCompra(Compra compra);
	void removerCompra(Compra compra);
	void adicionarPagamento(Pagamento pagamento);
	void removerPagamento(Pagamento pagamento);
	Double verSaldo();
	void verHistorico();
}
