package tests;

import java.util.List;
import java.util.ArrayList;

import model.classes.*;
import model.interfaces.*;
import model.funcional.*;

public class Main {

	public static void main(String[] args) {
//		preencheCarrinho();
//		testCompraFuncional();
		CompraJoiaFuncional c = new CompraJoiaFuncional(null);
		CompraJoiaFuncional c2 = new CompraJoiaFuncional(null);
		CompraJoiaFuncional c3 = new CompraJoiaFuncional(null);
		
		System.out.println(c.getCodigoCompra());
		System.out.println(c2.getCodigoCompra());
		System.out.println(c3.getCodigoCompra());
	}

	private static void preencheCarrinho() {
		Produto p = new ProdutoJoia("vassoura", "varre bem", 20.773);
		p.verProduto();
	}
	
	private static void testCompraFuncional() {
		Cliente c = new ClienteJoia("Fran", "Grita que ele vem");
		Compra compra1 = new CompraJoiaFuncional(c);
		Compra compra2 = new CompraJoiaFuncional(c);
		Compra compra3 = new CompraJoiaFuncional(c);
		
		Produto p1 = new ProdutoJoia("vassoura", "varre bem", 14.75);
		Produto p2 = new ProdutoJoia("cabo", "segura a vassoura", 3.25);
		
		compra1.adicionarProduto(p1);
		compra1.adicionarProduto(p2);
		
		Produto p3 = new ProdutoJoia("balde", "carrega liquido", 20.0);
		Produto p4 = new ProdutoJoia("alça", "carrega o balde", 1.0);
		
		compra2.adicionarProduto(p3);
		compra2.adicionarProduto(p4);
		
		Produto p5 = new ProdutoJoia("esponja", "para esfregar", 5.99);
		Produto p6 = new ProdutoJoia("mrMusculo", "para esfregar melhor", 20.773);
		
		compra2.adicionarProduto(p5);
		compra2.adicionarProduto(p6);
		
		
		c.adicionarCompra(compra1);
		c.adicionarCompra(compra2);
		c.adicionarCompra(compra3);
		
		
	}
	
	
	
}