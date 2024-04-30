package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();

        System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        Collections.sort(cores);

        System.out.println("\nCores em ordem alfabética:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        scanner.close();
    }
}
