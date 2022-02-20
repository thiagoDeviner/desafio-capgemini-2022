package desafioCapgemini2022;

import java.util.Arrays;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Anagrama {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite a palavra:");

		anagrama(palavra);
	}

	static void anagrama(String palavra) {

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i <= palavra.length(); i++) {

			for (int n = i; n < palavra.length(); n++) {

				char[] caracter = palavra.substring(i, n + 1).toCharArray();
				Arrays.sort(caracter);
				String subCaracter = new String(caracter);

				if (map.containsKey(subCaracter)) {
					map.put(subCaracter, map.get(subCaracter) + 1);
				} else {
					map.put(subCaracter, 1);
				}
			}
		}

		int anagramaPares = 0;

		for (String cont: map.keySet()) {

			int i = map.get(cont);
			anagramaPares += (i * (i - 1)) / 2;
		}
		JOptionPane.showMessageDialog(null,"O número de anagramas pares é de: " + anagramaPares);
	}

	}