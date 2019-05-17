package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection conectar(Database database) throws SQLException {
		String driverClass = database.getDriverClass();
		String caminho = database.getCaminho();
		String user = database.getUser();
		String senha = database.getSenha();
		Connection conexao = null;
		try {
			Class.forName(driverClass);
			conexao = DriverManager.getConnection(caminho, user, senha);
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
		return conexao;
	}
}
