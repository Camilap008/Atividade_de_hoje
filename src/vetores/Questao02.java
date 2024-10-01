package vetores;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		  String[] nomes = new String[4];
	        int[] idades = new int[4];
	        int somaIdades = 0;

	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < nomes.length; i++) {
	            System.out.print("Digite o nome do colega " + (i + 1) + ": ");
	            nomes[i] = scanner.nextLine();

	            System.out.print("Digite a idade de " + nomes[i] + ": ");
	            idades[i] = scanner.nextInt();
	            scanner.nextLine(); 

	            somaIdades += idades[i];
	        }

	        scanner.close();

	        double mediaIdades = (double) somaIdades / idades.length;

	        System.out.println("\nA média de idades dos colegas de turma é: " + mediaIdades);

	}

}
