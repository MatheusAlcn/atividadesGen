package colecoes;

import java.util.ArrayList;
import java.util.Comparator;

public class TestandoList {

	public static void main(String[] args) {
		// Ultilizando o ArrayList - coleção de dados
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		//nomes = "Maria"
		
		nomes.add("Maria");
		nomes.add("Matheus");
		nomes.add("Vinicius");
		nomes.add("Douglas");
		nomes.add("Paola");
		nomes.add("Eduardo");
		nomes.add("Lucas");
		
		System.out.println(nomes);
		
		nomes.add(2, "Jessica");
		System.out.println(nomes);
			
		System.out.println(nomes.get(5) + " é um participante da jornada dev java");
		
		nomes.add("Maria");
		
		System.out.println(nomes.indexOf("Maria"));
		System.out.println(nomes);
		
		nomes.remove(4);
		System.out.println(nomes);
		
		System.out.println("O tamanho do objeto é: " + nomes.size());
		
		System.out.println("A lista está vázia? " +nomes.isEmpty());
		
		System.out.println("Tem Matheus na lista? " + nomes.contains("Matheus"));
		
		nomes.sort(Comparator.reverseOrder());
	
		
	
		nomes.clear();
		System.out.println(nomes);
		System.out.println("A lista está vázia? " +nomes.isEmpty());
	}

}
