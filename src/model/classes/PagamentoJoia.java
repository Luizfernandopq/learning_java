package model.classes;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import model.interfaces.Pagamento;

public class PagamentoJoia implements Pagamento {

	private Double valor;
	private LocalDate data;
	
	public LocalDate getData() {
		return this.data;
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
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		String date = formatador.format(Date.valueOf(this.data));
		System.out.println("Pagamento dia: " + date + "\t Valor: " + 
				f.format(valor));
	}

}
