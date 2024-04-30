package lacosderepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        int numero;
		        int somaPositivos = 0;
		        
		        System.out.println("Digite números inteiros (digite 0 para parar):");
		        
		        do {
		            numero = scanner.nextInt();
		            if (numero > 0) {
		                somaPositivos += numero;
		            }
		        } while (numero != 0);
		        
		        System.out.println("A soma dos números positivos digitados é: " + somaPositivos);
		        
		        scanner.close();
		    }
		}

	


