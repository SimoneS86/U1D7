package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
	private Map<String, String> contatti = new HashMap<>();

	public RubricaTelefonica() {
		this.contatti = new HashMap<String, String>();
	}

	public void inserisciContatto(String nome, String numero) {
		this.contatti.put(nome, numero);
	}

	public void cancellaContatto(String nome) {
		this.contatti.remove(nome);
	}

	public String cercaNumero(String nome) {
		return this.contatti.get(nome);
	}

	public String cercaNome(String numero) {
		for (String nome : this.contatti.keySet()) {
			if (this.contatti.get(nome).equals(numero)) {
				return nome;
			}
		}
		return null;
	}

	public void stampaContatti() {
		for (String nome : this.contatti.keySet()) {
			System.out.println(nome + " - " + this.contatti.get(nome));
		}
	}
}
