package vetores;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos colegas você deseja adicionar? ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do colega " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nNomes dos colegas:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();


	}

}
