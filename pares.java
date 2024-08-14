package revisao;

import java.util.ArrayList;

public class pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numero = new ArrayList<Integer>();
		
		int val=0, soma=0;
				
		for(int i=l; i<=5; i++) {
			System.out.println("Digite um valor inteiro: ");
			val = ler.nextInt();
			numero.add(val);
			if (val % 2 == 0) {
				soma++;
			}
		}
		System.out.println("A quantidade de numeros pares informados são:" +soma);

	}

}
