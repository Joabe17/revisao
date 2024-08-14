package revisao;

import java.util.ArrayList;
import java.util.Scanner;

public class numerolista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		System.out.println("Digite numeros inteiros (digite '0' para finalizar) :");

		while (true) {
			int numero = scanner.nextInt();
			if (numero == 0) {
				break;
			}
			numeros.add(numero);
		}
		int soma = somarNumeros(numeros);
		System.out.println("A soma de todos os numeros é: " + soma);
	}
	public static int somarNumeros(ArrayList<Integer> numeros) {
		int soma = 0;
	    for (int numero : numeros) {
	    	soma += numero;
	    }
		return soma;
	    }

}

