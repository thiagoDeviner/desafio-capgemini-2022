package desafioCapgemini2022;

import javax.swing.JOptionPane;

public class SenhaForte {

	public static void main(String[] args) {
		
		String senha = JOptionPane.showInputDialog("Digite a senha:");
		
		
		if(senha.length() < 6) {
			int num = 6 - senha.length();
			System.out.println("Sua senha deve conter um mínimo de 6 caracteres");
			System.out.println("Adicione mais: " + num + " caracteres");
		
		}else if(!senha.matches("(?=.[!@#$%^&()-+]).{6,}")) {
			int num = 6 - senha.length();
			System.out.println("Você deve incluir ao menos um caractere especial!");
			System.out.println("Adicione mais: " + num + " caracteres");
		
		}else if(!senha.matches("(?=.*[a-z]).{6,}")){
			int num = 6 - senha.length();
			System.out.println("Você deve incluir ao menos uma letra minúscula!");
			System.out.println("Adicione mais: " + num + " caracteres");
		
		}else if(!senha.matches("(?=.*[A-Z]).{6,}")){
			int num = 6 - senha.length();
			System.out.println("Você deve incluir ao menos uma letra maiúscula!");
			System.out.println("Adicione mais: " + num + " caracteres");
		
		}else if(!senha.matches("(?=.*[0-9]).{6,}")){
			int num = 6 - senha.length();
			System.out.println("Você deve incluir ao menos um número!");
			System.out.println("Adicione mais: " + num + " caracteres");
		
		}else {
			System.out.println("Senha Forte!");
		}
}
}