package colecoes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set<Integer> numeros = new HashSet<>();
	        numeros.add(2);
	        numeros.add(5);
	        numeros.add(1);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(9);
	        numeros.add(7);
	        numeros.add(8);
	        numeros.add(10);
	        numeros.add(6);
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        
	        if (numeros.contains(numero)) {
	            System.out.println("Número " + numero + " Encontrado!");
	        } else {
	            System.out.println("O número " + numero + " não foi encontrado!");
	        }
		
	}

}
