package jana60;

public class BookStore {

	public static void main(String[] args) {
		
		String titolo = "9 algoritmi che hanno cambiato il futuro";
		System.out.println("Titolo: " + titolo);
		
		boolean copertinaFlessibile = true;
		boolean formatoKindle = false;
		short giornoPubblicazione = 1;
		short mesePubblicazione = 11;
		int annoPubblicazione = 2012;
		String autore = "John McCornick";
		
		//stelle di votazione
		float rating = 4.3f;
		int numeroVoti = 23;
		
		String descrizione = "bla blabla bla bla bla bla bla balfeuyrerfgegvevrfvehjygjefegfgefgeygfyeqgfqlyufgyqefglrfgler";
		
		double prezzoFinale = 17.10;
		double prezzoConsigliato = 18.00;
		double sconto = 0.05;
		//applico sconto
		double scontoPrezzo = prezzoConsigliato * sconto;
		double prezzoFinaleScontato = prezzoConsigliato - scontoPrezzo;
		System.out.println("Prezzo consigliato: " + prezzoConsigliato + "euro");
		System.out.println("Sconto del " + sconto*100 + "%");
		System.out.println("Meno " + scontoPrezzo + "euro");
		System.out.println("PPrezo scontato: " + prezzoFinaleScontato + " euro");



		
		
		String codiceUnivocoISBN = "987-876987654";
		float altezza = 21.0f;
		float larghezza = 13.7f;
		float spessore = 1.7f;
		System.out.println("Dimensioni: " + altezza + "x" + larghezza + "x" + spessore + "cm");
		
		
		
		
		
		
		
		
		

		
	}

}
