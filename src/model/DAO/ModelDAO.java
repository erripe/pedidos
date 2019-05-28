package model.DAO;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Model;
import model.Produto;
import util.Conexao;
import util.Database;

public class ModelDAO {
	private Database db = new Database();

	public ModelDAO() {
		
	}

	public ArrayList<Model> executeQuery(StringBuilder sql) {

		ArrayList<Model> list = new ArrayList<Model>();
		Connection con = Conexao.conectar(db);
		PreparedStatement stmt = con.prepareStatement(sql.toString());
		ResultSet rs = stmt.executeQuery(); // RETORNO

		// AUTOMATIZAR

		Class<?> clazz = this.getClass();

		while (clazz != null && !clazz.equals(Model.class)) {
			Field[] fields = clazz.getDeclaredFields();
			
			 for (Field f : fields) {
				if (!Modifier.isStatic(f.getModifiers())) {
					f.getAnnotation(Field);
					try {
						f.setAccessible(true);
						sb.append(f.getName()).append(" = ").append(f.get(this)).append(",");
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
		while (rs.next()) {
			codProduto = rs.getInt(1);
			nome = rs.getString(2);
			descricao = rs.getString(3);
			precoCompra = rs.getDouble(4);
			encargo = EncargoDAO.getEncargo(rs.getInt(5));
			emEstoque = rs.getInt(6);
			lp.add(new Produto(codProduto, nome, descricao, precoCompra, emEstoque, encargo));
		}
		rs.close();
		stmt.close();
		return list;

		Class<?> clazz = this.getClass();
		StringBuilder sb = new StringBuilder(clazz.getSimpleName()).append("");

		while (clazz != null && !clazz.equals(Object.class)) {
			Field[] fields = clazz.getDeclaredFields();
			for (Field f : fields) {
				if (!Modifier.isStatic(f.getModifiers())) {
					try {
						f.setAccessible(true);
						sb.append(f.getName()).append(" = ").append(f.get(this)).append(",");
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}

			if (!recursive) {
				break;
			}
			clazz = clazz.getSuperclass();
		}

		sb.deleteCharAt(sb.lastIndexOf(","));
		return sb.append("}").toString();

		String query = "Select ";
		
		for (String field : parameters) {
			query += field + ",";
		}
		

		return list;

	}
}
