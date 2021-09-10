package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO2 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
		String Poengsum = showInputDialog("Din Poengsum:?");
		int Karakter = Integer.parseInt(Poengsum);
		
		if (Karakter >= 0 && Karakter <= 39) {
			showMessageDialog(null, "Din Karakter er: F");
		}
			else if (Karakter >= 40 && Karakter <= 49) {
				showMessageDialog(null, "Din Karakter er: E");
			}
			else if (Karakter >= 50 && Karakter <= 59) {
				showMessageDialog(null, "Din Karakter er: D");
			}
			else if (Karakter >= 60 && Karakter <= 79) {
				showMessageDialog(null, "Din Karakter er: C");
			}
			else if (Karakter >= 80 && Karakter <= 89) {
				showMessageDialog(null, "Din Karakter er: B");
			}
			else if (Karakter >= 90 && Karakter <= 100) {
				showMessageDialog(null, "Din Karakter er: A");
			}
			else {
				showMessageDialog(null, "Error");
			}
		
			
		}
		}
		
}
