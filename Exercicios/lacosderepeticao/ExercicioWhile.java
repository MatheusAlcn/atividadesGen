package lacosderepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		   Scanner leia = new Scanner(System.in);
	        
	        int idade;
	        int totalMenorQue21 = 0;
	        int totalMaiorQue50 = 0;
	        
	        System.out.println("Digite as idades das pessoas (caso queira parar o programa digite -1) :");

	        while (true) {
	            System.out.print("Idade: ");
	            idade = leia.nextInt();
	            
	            if (idade < 0) {
	                break;
	            }
	            
	            if (idade < 21) {
	                totalMenorQue21++;
	            } else if (idade > 50) {
	                totalMaiorQue50++;
	            }
	        }
	        
	        System.out.println("Total de pessoas com idade menor que 21: " + totalMenorQue21);
	        System.out.println("Total de pessoas com idade maior que 50: " + totalMaiorQue50);
	        
	        leia.close();
	    }
	}