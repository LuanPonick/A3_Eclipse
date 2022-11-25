package songs.classes;

import javax.swing.JOptionPane;

import bancodedados.CRUDUSUARIO;

public class Main {
	public static void main(String[] args) {
		
//		//'21','AASDAS','1234'
//		teste.Inserir("21","AASDAS","1234");
//		String a = CRUD.Login("A","1234");
//		System.out.println(a);
		
//		String a = "12345";
//		System.out.println(a.charAt(1));
		String B = "                      com rola               a                hola";
		B = B.replaceAll("\s+", " ");
		JOptionPane.showMessageDialog(null, B.length());
		
	}
}
