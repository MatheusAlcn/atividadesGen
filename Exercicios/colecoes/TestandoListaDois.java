package colecoes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestandoListaDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		for(String memes : nomes) {
		System.out.println(memes + " A");
		}
		
		Iterator <String> iNomes = nomes.iterator();
		
		while(iNomes.hasNext()) {
			System.out.println(iNomes.next());
		}
		
		
	}

}
