package tests;
import model.Cliente;
import model.Compra;
import model.Produto;


public class Main {

	public static void main(String[] args) {
		preencheCarrinho();
	}

	private static void preencheCarrinho() {
		Produto p = new Produto("vassoura", 7.90, "varre bem");
		Cliente c = new Cliente("elon mosca", "40028922");
		Compra carrinho = new Compra(c);
		carrinho.addProduto(p);
		carrinho.comprar();
		System.out.println(carrinho);
		System.out.println(c);
	}
}