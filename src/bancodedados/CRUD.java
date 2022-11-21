package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.cj.xdevapi.Result;

public class CRUD {
	public void Inserir(String nome ,String email,String senha) {
		Connection conexao = null;
		PreparedStatement comando = null;
		ResultSet result = null;
			
		try {
			conexao = ClasseDeConexao.Conectar();
			String sql = "INSERT INTO usuarios(nome,email,senha) VALUES(?,?,?)";
			
			//INSERT INTO usuarios(id,nome,email,senha) VALUES(1,'21','AASDAS','1234');
			
			comando = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, senha);
			
			if(comando.executeUpdate() > 0) {
				result = comando.getGeneratedKeys();
				if(result.next()) {
					System.out.println("dados gravados na tabela do caralho");
				}
			}
		}
		catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			ClasseDeConexao.FexarConexao(conexao);
			try {
				comando.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static String Login(String email, String senha){
		Connection conexao = null;
		Statement comando = null;
		ResultSet result = null;
		
		try {
			conexao = ClasseDeConexao.Conectar();
			String sql = "SELECT * FROM usuarios WHERE email = '"+email+"' AND senha = '"+senha+"'";
			comando = conexao.createStatement();
			result = comando.executeQuery(sql);
			if(!result.next()) {
				System.out.println("Conta nao verificada");
				return "Algo foi escrito errado favor confira!";
			}
			else{
				//se o sql falhar o comando nao chega até essa parte 
				System.out.println("Conta Verificada");
				return "LOGIN";
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			ClasseDeConexao.FexarConexao(conexao);
			try {
				comando.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			System.out.print("FECHEI PORRA");
		}//AULA DO DIA 22 DE SETEMPRO 1:49:30
		return "erro";
	}
}
