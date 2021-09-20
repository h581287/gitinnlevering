package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {

	public static void main(String[] args) {
			
		String tallTxt = showInputDialog("Bruttoinntekt");
		int Bruttoinntekt = Integer.parseInt(tallTxt);
		
		double trinn1 = Bruttoinntekt*0.0093;
		double trinn2 = Bruttoinntekt*0.0241;
		double trinn3 = Bruttoinntekt*0.1151;
		double trinn4 = Bruttoinntekt*0.1452;
		
		if (Bruttoinntekt <= 164100) {
			System.out.println("du treng ikkje å skatt"); 
		} else if (Bruttoinntekt > 164100 && Bruttoinntekt < 230950) {
			System.out.print(" du må skatte " + trinn1 + "av inntekta.");
		} else if (Bruttoinntekt > 230951 && Bruttoinntekt < 580650) {
			System.out.println("du må skatte " + trinn2 + "av inntekta.");
		} else if (Bruttoinntekt > 580651 && Bruttoinntekt < 934051) {
			System.out.println("du må skatte " + trinn3 + "av inntekta.");
		} else {
	        System.out.println("du må skatte " + trinn4 + "av inntekta.");
		}
	}

}
