package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ManipolaListe {
	public static void main(String[] args) {
		int n = 10;
		List<Integer> listaNumeri = creaLista(n);
		System.out.println("Lista creata: " + listaNumeri);

		List<Integer> listaModificata = listaPiùListaInvertita(listaNumeri);
		System.out.println("Lista seguita da lista invertita: " + listaModificata);

		boolean pari = true;
		stampaListaPariDispari(listaNumeri, pari);
	}

	public static List<Integer> creaLista(int n) {
		List<Integer> lista = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			lista.add(rand.nextInt(101));
		}
		Collections.sort(lista);
		return lista;
	}

	public static List<Integer> listaPiùListaInvertita(List<Integer> lista) {
		List<Integer> listaInvertita = new ArrayList<>(lista);
		Collections.reverse(listaInvertita);
		List<Integer> listaModificata = new ArrayList<>(lista);
		listaModificata.addAll(listaInvertita);
		return listaModificata;
	}

	public static void stampaListaPariDispari(List<Integer> lista, boolean pari) {
		if (pari) {
			System.out.print("Elementi in posizione pari: ");
			for (int i = 0; i < lista.size(); i += 2) {
				System.out.print(lista.get(i) + " ");
			}
		} else {
			System.out.print("Elementi in posizione dispari: ");
			for (int i = 1; i < lista.size(); i += 2) {
				System.out.print(lista.get(i) + " ");
			}
		}
	}
}
