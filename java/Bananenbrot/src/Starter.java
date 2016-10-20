import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Starter {

	public static void main(String args[]){
	
		//Den ganzen rotz einlesen
		
		BufferedReader in = null;
		
		try{
		in = new BufferedReader(new FileReader("kosten.csv"));
		} catch(FileNotFoundException e){
			System.err.println("Datei wurde nicht gefunden.");
			e.printStackTrace();
		}
		
		String headlines = null;
		String data = null;
		
		try{
			headlines 	= in.readLine();
			data		= in.readLine();
		} catch(IOException e){
			System.err.println("Überschrift von den Daten konnte nicht gelesen werden");
			e.printStackTrace();
		}
		
		System.out.println("Ausgabe:");
		String[] val = data.split(";");
		
		for(int a=0;a<val.length;a++){
			val[a] = val[a].substring(1, val[a].length()-1);
			//System.out.println(val[a]);
		}
		
		int flaeche = Integer.parseInt(val[0]);
		int hoehe = Integer.parseInt(val[1]);
		int anzahl = Integer.parseInt(val[2]);
		int jahr = Integer.parseInt(val[3]);
		
		final double VOLUMENFAKTOR = 3.7;
		
		double faktor = 0.0;
		
		switch(jahr){
			case 1:
				faktor = 5.0;
				break;
			case 2: 
				faktor = 3.0;
				break;
			case 3:
				faktor = 1.8;
				break;
			case 4:
				faktor = 1.0;
				break;
			case 5:
				faktor = 0.7;
				break;
			case 6:
				faktor = 0.3;
				break;
		}
		
		double kosten = flaeche * hoehe * anzahl * 3.7 * jahr;
	}
	
	
}
