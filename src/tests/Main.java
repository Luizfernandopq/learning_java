package tests;

import java.util.List;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import model.classes.*;
import model.interfaces.*;
import model.funcional.*;

public class Main {

	public static void main(String[] args) {
//		preencheCarrinho();
		testCompraFuncional();
	}

	private static void preencheCarrinho() {
		Produto p = new ProdutoJoia("vassoura", "varre bem", 20.773);
		p.verProduto();
	}
	
	private static void testCompraFuncional() {
		ClienteJoia c = new ClienteJoia("Fran", "Grita que ele vem");
		Compra compra0 = new CompraJoiaFuncional(c);
		Compra compra1 = new CompraJoiaFuncional(c);
		Compra compra2 = new CompraJoiaFuncional(c);
		
		Produto p1 = new ProdutoJoia("vassoura", "varre bem", 14.75);
		Produto p2 = new ProdutoJoia("cabo", "segura a vassoura", 3.25);
		
		compra0.adicionarProduto(p1);
		compra0.adicionarProduto(p2);
		
		Produto p3 = new ProdutoJoia("balde", "carrega liquido", 20.0);
		Produto p4 = new ProdutoJoia("alça", "carrega o balde", 1.0);
		
		compra1.adicionarProduto(p3);
		compra1.adicionarProduto(p4);
		
		Produto p5 = new ProdutoJoia("esponja", "para esfregar", 5.99);
		Produto p6 = new ProdutoJoia("mrMusculo", "para esfregar melhor", 9.99);
		
		compra2.adicionarProduto(p5);
		compra2.adicionarProduto(p6);
		
		
		c.adicionarCompra(compra0);
		c.adicionarCompra(compra1);
		c.adicionarCompra(compra2);
		
		Comparator<? super Compra> comp = (c1, c2) -> {
			return c1.getValorTotal().compareTo(c2.getValorTotal());
		};
		c.getCompras().sort(comp);
		System.out.println(c.getCompras());
		c.verHistorico();
	}
	
	private static void testeCodigoAutoIncrement() {
		CompraJoiaFuncional c = new CompraJoiaFuncional(null);
		CompraJoiaFuncional c2 = new CompraJoiaFuncional(null);
		CompraJoiaFuncional c3 = new CompraJoiaFuncional(null);
		
		System.out.println(c.getCodigoCompra());
		System.out.println(c2.getCodigoCompra());
		System.out.println(c3.getCodigoCompra());
	}
	
	
	
}