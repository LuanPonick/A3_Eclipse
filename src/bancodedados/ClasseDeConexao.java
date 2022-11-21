package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClasseDeConexao 
{
	private static Connection conexao = null;
	public static Connection Conectar() 
	{
		try 
		{
			if(conexao == null) 
			{
				String url = "jdbc:mysql://localhost/ongssystem";
				conexao = DriverManager.getConnection(url,"root","");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
			return conexao;
	}//função Conectar()
	
	public static void FexarConexao(Connection c)
	{
		try {
			if(c != null)
			{
				c.close();
				conexao = null;
			}
		}
	
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
