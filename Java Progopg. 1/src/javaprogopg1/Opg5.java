package javaprogopg1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Opg5 {

	public static void main(String[] args) {
		// Vet jeg kunne forkortet denne betraktelig, men hadde rett og slett ikke tid. Prioriterte å forstå heller enn streamline denne gang
	
		for (int i =1; i<=10; i++) {
			
			
			int tallKarakter = parseInt(showInputDialog("Tallkarakter:"));
			while (tallKarakter <0 || tallKarakter > 100) {
				tallKarakter = parseInt(showInputDialog("Ugyldig karakter"));
				} // fjernes denne blokken vil siste else setning besvare 5b
				
			if (tallKarakter >= 90 && tallKarakter <= 100) {
				String karakter = ("A") ;
				String utTxt = "Din bokstavkarakter er " + karakter;
				System.out.println(utTxt);
			}
			else if (tallKarakter >= 80 && tallKarakter <= 89) {
				String karakter = ("B") ;
				String utTxt = "Din bokstavkarakter er " + karakter;
				System.out.println(utTxt);
			}
			else if (tallKarakter >= 60 && tallKarakter <= 79) {
				String karakter = ("C") ;	
				String utTxt = "Din bokstavkarakter er " + karakter;
				System.out.println(utTxt);
			}
			else if (tallKarakter >= 50 && tallKarakter <= 59) {
				String karakter = ("D") ;	
				String utTxt = "Din bokstavkarakter er " + karakter;
				System.out.println(utTxt);
			}
			else if (tallKarakter >= 40 && tallKarakter <= 49) {
				String karakter = ("E") ;
				String utTxt = "Din bokstavkarakter er " + karakter;
				System.out.println(utTxt);
			}
			else if (tallKarakter >= 0 && tallKarakter <= 39) {
				String karakter = ("F");
				String utTxt = "Din bokstavkarakter er " + karakter;
				System.out.println(utTxt);
			}	
			else System.out.println("Ugyldig karakter");
	        
			}
	        }
	        }
	


