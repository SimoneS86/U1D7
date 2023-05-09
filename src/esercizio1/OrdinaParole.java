package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OrdinaParole {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digita il numero di parole da inserire: ");
		int n = input.nextInt();

		String[] parole = new String[n];
		System.out.println("Inserisci le parole:");

		for (int i = 0; i < n; i++) {
			parole[i] = input.next();
		}

		Set<String> paroleSet = new HashSet<String>();
		Set<String> duplicati = new HashSet<String>();

		for (String parola : parole) {
			if (!paroleSet.add(parola)) {
				duplicati.add(parola);
			}
		}

		System.out.println("Parole duplicate: " + duplicati);
		System.out.println("Numero di parole distinte: " + paroleSet.size());

		System.out.println("Elenco delle parole distinte:");
		for (String parola : paroleSet) {
			System.out.println(parola);
		}
		input.close();
	}
}
