package model.interfaces;

public interface Cliente {
	
	void adicionarCompra();
	void adicionarPagamento();
	Double verSaldo();
	void verHistorico();
	void verHistoricoPeloMes();
}
