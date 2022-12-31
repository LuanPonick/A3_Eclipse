package songs.classes;

import javax.swing.JOptionPane;

import bancodedados.CRUDUSUARIO;
import songs.windows.Home;
import songs.windows.PrincipalWindowJ;

public class LoginRegisterController {
	public static void TradeToHome() {
		Home home = new Home();
		
		home.frmSongs.setVisible(true);
	}
	public static void TradeToPrincipal(String nome ,String email){
		PrincipalWindowJ principalWindowJ = new PrincipalWindowJ(nome,email);
		principalWindowJ.setVisible(true);
			
	}
	public static String  TryToLogin(String email , String senha ) {
		if(email.equals("")) {
						
			return "o seu email esta vazio";
		}
		if(senha.equals("")) {
			
			
			return "a senha esta vazia";
		}
		CRUDUSUARIO crud = new CRUDUSUARIO();
		String resultado = crud.Login(email, senha);
		if(resultado.equals("LOGIN")) {
			return "LOGIN";
		}
		return "a senha ou o email esta incorreta tente novamentes";
	}
	
	public static String TryToRegister(String user,String email,String senha1,String senha2) {
		CRUDUSUARIO crud = new CRUDUSUARIO();
		boolean emailCorreto = false;

		user = user.replaceAll("\s+", " ");
		
		if(!senha1.equals(senha2)) {
			JOptionPane.showMessageDialog(null, "As senhas estao diferentes");
			return "";
		}
		
		if(senha1.length() < 6) {
			JOptionPane.showMessageDialog(null, "a senha tem que conter no minimo 6 caracteres");
			return "";
		}
		if(email.length() < 7) {
			JOptionPane.showMessageDialog(null, "seu email tem que ser valido!!!");
			return "";
		}
		for(int i = 0;i < email.length();i++) {
			char teste = email.charAt(i);
			if(teste == '@') {
				emailCorreto = true;
			}
		}
		if(!emailCorreto) {
			JOptionPane.showMessageDialog(null, "seu email tem que ser valido!!!");
			return "";
		}
		
		if(user.length() <= 2) {
			
			JOptionPane.showMessageDialog(null, "favor insira seu primeiro nome sem abreviaçoes");
			return "";
		}else if(user.length()> 60) {
			JOptionPane.showMessageDialog(null, "favor colocar seu primeiro nome somente");
			return "";
		}
		
		String teste = crud.Login(email, senha1);
		if(teste.equals("LOGIN")) {
			JOptionPane.showMessageDialog(null, "essa conta ja existe favor apenas logar");
			return "";
		}
		crud.Inserir(user, email, senha1);
		return "Logar";
	}
}
