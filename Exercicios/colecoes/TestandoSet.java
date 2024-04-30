package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TestandoSet {

	public static void main(String[] args) {
		// utilizando o set oara coleções de dados
		
		Set<String> nomes = new HashSet<String>();
		//nomes = "Thiago";
		
		nomes.add("Yago");
		nomes.add("Caua");
		nomes.add("Vini");
		nomes.add("Lucas");
		nomes.add("Daniel");
		nomes.add("Matheus");
		
		System.out.println(nomes);
		
		nomes.remove("Caua");
		System.out.println(nomes);
		
		System.out.println(nomes.size());
		
		System.out.println(nomes.contains("Gustavo"));
		
		System.out.println(nomes.hashCode());
		
		for(String michaelJackson : nomes) {
		System.out.println(michaelJackson);
		}

	}

}
