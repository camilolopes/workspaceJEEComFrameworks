package br.com.teste;

import java.util.Iterator;
import java.util.List;

import br.com.bean.Estoque;
import br.com.dao.EstoqueDAO;

public class CriteriaEstoqueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//exibirTudo();
	//	exibirRestricaoNome();
	//	exibirBuscaProdlike();
		//exibirBuscaProdLikend();
	//	exibirBuscaProdPreco();
		//exibirbuscaProdOR();
	//exibirbuscaProdAnd();
		//exibirbuscaProdDisjuction();
		//exibirbuscaProdConjuction();
		//exibirbuscaOrder();
	//	exibirProjecaoProd();
		exibirProjecaoProdLista();
	//	exibirProjecaoProp();
		//exibirProjecaoSum();
	}
	
	public static  void exibirTudo(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List<Estoque> exibir = estoquedao.getTodos(); 
		for (Estoque estoque : exibir) {
			System.out.println(estoque.getNomeProduto());
		}
	}
	
	public static void exibirEqNome(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estoquedao.buscaProd(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId());
			System.out.println(" "+ estoque.getNomeProduto());
		}
		
	}
	public static void exibirBuscaProdlike(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estoquedao.buscaProdlike(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId()); 
			System.out.println(" " + estoque.getNomeProduto()); 
		}
	}
	
	public static void exibirBuscaProdLikend(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estoquedao.buscaProdEndLike(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId()); 
			System.out.println(" " + estoque.getNomeProduto());
		}	}
	
	public static void exibirBuscaProdPreco(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estoquedao.buscaProdPreco(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId()); 
			System.out.println(" " + estoque.getNomeProduto());
		}}
	public static void exibirbuscaProdOR(){
		EstoqueDAO estqouedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estqouedao.buscaProdOr(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId()); 
			System.out.println(" " + estoque.getNomeProduto());
		}
	}
	public static void exibirbuscaProdAnd(){
		EstoqueDAO estqouedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estqouedao.buscaProdAnd(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId()); 
			System.out.println(" " + estoque.getNomeProduto());
		}
	}
	public static void exibirbuscaProdDisjuction(){
		EstoqueDAO estqouedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estqouedao.buscaProdDisjuction(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId()); 
			System.out.println(" " + estoque.getNomeProduto());
		}
	}
	public static void exibirbuscaProdConjuction(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estoquedao.buscaProdConjuction(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId()); 
			System.out.println(" " + estoque.getNomeProduto());
		}
	}
	public static void exibirbuscaOrder(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List<Estoque> exibirprod = estoquedao.ordenaProd(); 
		for (Estoque estoque : exibirprod) {
			System.out.print("id " + estoque.getId()); 
			System.out.println(" " + estoque.getNomeProduto());
		}		
	}
		public static void exibirProjecaoProd(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List exibirprod = estoquedao.projecaoProd(); 
		for (Object mediavalor : exibirprod) {
			System.out.print("Media valor Produtos: " + mediavalor); 
		}	}
		
	public static void exibirProjecaoProdLista(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List exibirprod = estoquedao.projecaoProdLista(); 
			Iterator iter = exibirprod.iterator(); 
			while (iter.hasNext()) {
				Object[] object = (Object[]) iter.next();
			for (int i = 0; i < object.length; i++) {				
				switch (i) {
				case 0:
					System.out.println("Maior Valor " + object[i]);
					break;
				case 1:
					System.out.println("Menor Valor  "+ object[i]);
					break;
				case 2:
					System.out.println("Total em Estoque "+ object[i]);
					break;
				}
			}}
		}//fim do metodo
	
	public static void exibirProjecaoProp(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
		List exibirprod = estoquedao.projecaoProdProp(); 
		Iterator iter = exibirprod.iterator();
		while(iter.hasNext()){
			Object[] obj = (Object[]) iter.next(); 
			for (int i = 0; i < obj.length; i++) {
				System.out.print( obj[i] + " ");
		}}
	}
	public static void exibirProjecaoSum(){
		EstoqueDAO estoquedao = new EstoqueDAO(); 
			System.out.println("Valor em Estoque (sum) " +estoquedao.projecaoSum());
	}
}
