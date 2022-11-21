package songs.classes;

import bancodedados.CRUD;

public class Main {
	public static void main(String[] args) {
		
//		//'21','AASDAS','1234'
//		teste.Inserir("21","AASDAS","1234");
		String a = CRUD.Login("A","1234");
		System.out.println(a);
	}
}
