package lacosderepeticao;

import java.util.Scanner;

public class ExercicioFor {
	
	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int pares = 0;
		        int impares = 0;

		        System.out.println("Digite 10 números:");

		        for (int i = 0; i < 2; i++) { 
		            for (int j = 0; j < 5; j++) { 
		                int numero = scanner.nextInt();
		                if (numero % 2 == 0) {
		                    pares++; 
		                } else {
		                    impares++; 
		                }
		            }
		        }

		        System.out.println("Quantidade de números pares: " + pares);
		        System.out.println("Quantidade de números ímpares: " + impares);

		        scanner.close();
		    }
		}

