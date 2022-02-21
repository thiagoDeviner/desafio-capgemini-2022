package desafioCapgemini2022;

import javax.swing.JOptionPane;

public class SenhaForte {

	public static void main(String[] args) {
		
		
		
		while(true){
			
			String senha = JOptionPane.showInputDialog("Digite a senha:");
			
			if(senha.length() < 6) {
				int num = 6 - senha.length();
				JOptionPane.showMessageDialog(null,"Sua senha deve conter um mínimo de 6 caracteres. "
						+ "\nAdicione mais: " + num + " caracteres");
			
			}else if(!senha.matches("(?=.*[!@#$%^&()-+]).{6,}")) {
				int num = 6 - senha.length();
				JOptionPane.showMessageDialog(null,"Você deve incluir ao menos um caractere especial!");
				JOptionPane.showMessageDialog(null,"Adicione mais: " + num + " caracteres");
			
			}else if(!senha.matches("(?=.*[a-z]).{6,}")){
				JOptionPane.showMessageDialog(null,"Você deve incluir ao menos uma letra minúscula!");
				
			}else if(!senha.matches("(?=.*[A-Z]).{6,}")){
				JOptionPane.showMessageDialog(null,"Você deve incluir ao menos uma letra maiúscula!");
			
			}else if(!senha.matches("(?=.*[0-9]).{6,}")){
				JOptionPane.showMessageDialog(null,"Você deve incluir ao menos um número!");
			
			}else {
				JOptionPane.showMessageDialog(null,"Senha Forte!");
				break;
			}
		}
	}
}
