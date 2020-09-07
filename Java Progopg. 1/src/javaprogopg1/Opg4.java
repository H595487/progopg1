package javaprogopg1;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Opg4 {

	public static void main(String[] args) {
		String intektTxt = showInputDialog("Hvor mye tjener du?:");
		double intekt = parseDouble(intektTxt);
		double skatt =-1;
		if (intekt >= 0 && intekt <= 164100) {
			skatt = 0;
			 
		}
		else if 
		(intekt > 164100 && intekt <= 230950) {
		    skatt = (intekt * 0.0093);
		    }
		
		
		else if 
			 (intekt > 230950 && intekt <= 580650) {
				 skatt = (intekt * 0.0241);
			}
		
		else if
		(intekt > 580650 && intekt <= 934050) {
			skatt = (intekt * 0.1152);
		}
		else if
		
		(intekt > 934050) {
			skatt = (intekt * 0.1452);
		}
		
	
		
		String utTxt = "Du skal skatte " + skatt + "kr";
		System.out.println(utTxt);
			
		
		
			
				}
}
