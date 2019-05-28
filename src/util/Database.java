package util;

public class Database {
	String driverClass;
	String caminho;
	String user;
	String senha;
	
	public Database(String driverClass, String caminho, String user, String senha) {
		super();
		this.driverClass = driverClass;
		this.caminho = caminho;
		this.user = user;
		this.senha = senha;
	}

	public Database() {
		super();
		this.driverClass = "com.mysql.cj.jdbc.Driver";
		this.caminho = "jdbc:mysql://localhost/sistemaVendas?useTimezone=true&serverTimezone=UTC";
		this.user = "root";
		this.senha = "";
	}

	public String getDriverClass() {
		return driverClass;
	}

	public String getCaminho() {
		return caminho;
	}

	public String getUser() {
		return user;
	}

	public String getSenha() {
		return senha;
	}
	
}
