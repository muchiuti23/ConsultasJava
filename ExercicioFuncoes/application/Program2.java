package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto_02;
import services.ProdutoServices;

public class Program2 {

	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		List<Produto_02> produtos = new ArrayList<>();
		
		produtos.add(new Produto_02("Tv", 900.00));
		produtos.add(new Produto_02("Mouse", 50.00));
		produtos.add(new Produto_02("Tablet", 350.50));
		produtos.add(new Produto_02("HD", 80.90));
		
		System.out.println("Soma = " + String.format("%.2f", new ProdutoServices()
				.filtroSoma(produtos, p -> p.getNome().charAt(0) == 'M')));		
	}
}
