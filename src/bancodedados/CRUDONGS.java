package bancodedados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDONGS {
	public ResultSet Listar(){
		Connection conexao = null;
		Statement comando = null;
		ResultSet result = null;
		
		try {
			conexao = ClasseDeConexao.Conectar();
			String sql = "SELECT * FROM ongs";
			comando = conexao.createStatement();
			result = comando.executeQuery(sql);
			return result;
	
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
		}//AULA DO DIA 22 DE SETEMPRO 1:49:30
		
		return result;
	}
}
