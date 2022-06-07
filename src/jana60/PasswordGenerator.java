package jana60;

public class PasswordGenerator {

	public static void main(String[] args) {
		/*Live coding: Password Generator
          Il programma deve fare quanto segue: salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un 
          utente suddivisa in giorno, mese e anno in numero generare (e stampare a video) una password concatenando nome, cognome, colore
          preferito e somma di giorno, mese e anno di nascita, separate dal carattere - Esempio: ho un utente che si chiama Pinco Pallo, 
          nato il 12/05/1994, il cui colore preferito è il magenta*/
		
		String nome = "Tonia";
		String cognome = "Fioretto";
		String colorePreferito = "Verde";
		int giornoNascita = 2;
		int meseNascita = 9;
		int annoNascita = 1994;
		int somma = giornoNascita + meseNascita + annoNascita;
		
		String password = nome + cognome + colorePreferito + somma;
		System.out.println("Password: " + password);
		
		
		
		
		
		

		
		
	}

}
