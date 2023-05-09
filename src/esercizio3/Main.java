package esercizio3;

public class Main {

	public static void main(String[] args) {
		RubricaTelefonica rubrica = new RubricaTelefonica();
		rubrica.inserisciContatto("Roberto Baggio", "1234567890");
		rubrica.inserisciContatto("Paolo Maldini", "35986474869");
		rubrica.inserisciContatto("Alessandro Del Piero", "1976783769");
		rubrica.inserisciContatto("Javier Zanetti", "984131849");
		rubrica.inserisciContatto("Ajeje Brazorf", "1338483387");
		rubrica.stampaContatti();
		String nome = "Alessandro Del Piero";
		String numero = "984131849";
		System.out.println("Il numero di " + nome + " è: " + rubrica.cercaNumero(nome));
		System.out.println("Il nome corrispondente al numero " + numero + " è: " + rubrica.cercaNome(numero));
		rubrica.cancellaContatto("Ajeje Brazorf");
		rubrica.stampaContatti();
	}

}
