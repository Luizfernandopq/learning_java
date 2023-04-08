package tests;

import model.classes.*;
import model.interfaces.*;

public class Main {

	public static void main(String[] args) {
		preencheCarrinho();
	}

	private static void preencheCarrinho() {
		Produto p = new ProdutoJoia("vassoura", "varre bem", 20.773);
		p.verProduto();
	}
}