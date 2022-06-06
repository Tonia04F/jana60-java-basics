package jana60;

public class SistemiOperativi {
	public static void main(String[] args) {
		int macUsers = 3;
		int windowsUsers = 20;
		System.out.println("MacUsers: " + macUsers);
		System.out.println("WindowsUsers: " + windowsUsers);
		int totaleUtenti = macUsers + windowsUsers;
		System.out.println("Totale: " + totaleUtenti);
		
		//per calcolo in percentuale di utenti
		double percentualeMac = macUsers *100 / totaleUtenti;
		double percentualeWindows = windowsUsers *100 / totaleUtenti;
		System.out.println("percentuale Mac: " + percentualeMac);
		System.out.println("percentuale Windows: " + percentualeWindows);
		
	}

}
