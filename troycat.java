package revisao;

import java.util.Scanner;

public class troycat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner leia = new Scanner (System.in);
		a = 10;
		System.out.println("Digite um numero: ");
		b = leia.nextInt();
		try {
		c = a/b;
		System.out.println("Valor de C: " +c);
	 } catch (ArithmeticException erro) {
		System.out.println("Não existe divisão por zero");
	}
	}
}




