package javaprogopg1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
public class Opg6 {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Heltall?:"));
		
		int a = n;
		int x = 1;

		while (n>1) {
		   x *=n;
		   n--;
		}
		System.out.println(a + "! = " + x);

	}

}
