package exerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumeroNegativo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Nao negativo");
		} else {
			System.out.println("Negativo");
		}
		
		
		sc.close();
	}

}
