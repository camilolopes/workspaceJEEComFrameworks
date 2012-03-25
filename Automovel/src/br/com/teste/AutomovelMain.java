package br.com.teste;

import java.util.Scanner;
import br.com.bean.Automovel;
import br.com.dao.AutomovelDAO;

public class AutomovelMain {

	/* usaremos a classe Scanner para receber os dados 
	 * via teclado 
	 */
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in); 
		Automovel automovel = new Automovel();
		System.out.println("Informe o nome do veículo"); 
			String nomeauto = leitura.nextLine(); 
			automovel.setNome(nomeauto); 
		System.out.println("informe o ano:"); 
			int anoauto = leitura.nextInt();
			automovel.setAno(anoauto); 
		System.out.println("Informe o fabricante"); 
			String nomefabricante = leitura.next(); 
			automovel.setFabricantenome(nomefabricante);
		AutomovelDAO automoveldao = new AutomovelDAO();
		//salvando o objeto persistido no banco de dados
				automoveldao.salvar(automovel);				
	}

}
