package model.interfaces;

public interface Cliente {
	
	void adicionarCompra();
	void removerCompra();
	void adicionarPagamento();
	void removerPagamento();
	Double verSaldo();
	void verHistorico();
	void verHistoricoPeloMes();
}
