package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {
	
		for (int tall = 0; tall < 10; tall++) {
		
		String poengTxt = showInputDialog("poeng: ");
		int poeng = Integer.parseInt(poengTxt);
		
		
	if (poeng < 0 || poeng > 100) {
		System.out.println("Ugyldig poengsum, skriv inn mellom 0 og 100 poeng");
		tall--;	
	} else if (poeng <= 100 && poeng >=90) {
		System.out.println("Karakter A, " + poeng + "av 100 poeng.");
	} else if (poeng <= 89 && poeng >=80) {
		System.out.println("Karakter B, " + poeng + "av 100 poeng.");
	} else if (poeng <= 79 && poeng >=60) {
		System.out.println("Karakter C, " + poeng + "av 100 poeng.");
	} else if (poeng <= 59 && poeng >=50) {
		System.out.println("Karakter D, " + poeng + "av 100 poeng.");
	} else if (poeng <= 49 && poeng >=40) {
		System.out.println("Karakter E, " + poeng + "av 100 poeng.");
	} else {
		System.out.println("Karakter E, " + poeng + "av 100 poeng.");	
	}
		}

	}

}
