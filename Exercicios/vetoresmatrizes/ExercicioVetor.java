package vetoresmatrizes;

import java.util.Scanner;

public class ExercicioVetor {

	    public static int encontrarPosicao(int numero, int[] vetor) {
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numero) {
	                return i + 1;
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);

	        int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
	        
	        System.out.println("Digite o número que deseja encontrar: ");
	        int numero = leia.nextInt(); 

	        int posicao = encontrarPosicao(numero, vetor);
	        
	        if (posicao != -1) {
	            System.out.println("O número " + numero + " está na posição " + posicao + " do vetor.");
	        } else {
	            System.out.println("Número não encontrado no vetor.");
	        }
	    }
	}
