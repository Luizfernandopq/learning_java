package model.classes;

import java.text.DecimalFormat;
import java.time.LocalDate;

import model.interfaces.Pagamento;

public class PagamentoJoia implements Pagamento {

	private Double valor;
	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public Double getValor() {
		return this.valor;
	}

	@Override
	public void verPagamento() {
		DecimalFormat f = new DecimalFormat("#.##");
		System.out.println("Pagamento dia: " + data + "\t Valor: " + 
				f.format(valor));
	}

}
