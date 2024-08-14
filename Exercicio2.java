package revisao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		System.out.println("Digite numeros inteiros (digite '0' para finalizar):");
		
		while (true) {
			int numero = scanner.nextInt();
			if (numero == 0) {
				break;
			}
			numeros.add(numero);
		}
		System.out.println("Numeros pares na lista:");
		mostrarNumerosPares(numeros);
	}
	public static void mostrarNumerosPares(ArrayList<Integer> numeros) {
		for (int numero : numeros) {
			if (numero % 2 ==0) {
				System.out.println(numero);
			}
		}

	}

}
