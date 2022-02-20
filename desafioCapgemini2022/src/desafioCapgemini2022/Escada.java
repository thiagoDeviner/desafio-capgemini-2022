package desafioCapgemini2022;

import javax.swing.JOptionPane;

public class Escada {

	public static void main(String[] args) {

		int degraus = Integer.parseInt(JOptionPane.showInputDialog("Quantos degraus você deseja? "));
		for (int i = 0; i < degraus; i++) { 
			for (int y = degraus - i; y > 1; y--) { 
				System.out.print(" ");
			}
			for (int y = 0; y <= i; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}