package model.DAO;

import java.util.List;

import model.Produto;

public class ProdutoDAO extends ModelDAO {

	public ProdutoDAO() {
	}

	@SuppressWarnings("unchecked")
	public static List<Produto> findList(String codProd, String descProd) throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		String sql = "";

		if (!codProd.equals("")) {
			sql += " AND codProd = " + codProd;
		}

		if (!descProd.equals("")) {
			sql += " AND descProd LIKE ('%" + descProd + "%')";
		}

		return ModelDAO.cast(dao.executeFindList(sql, new Produto()));
	}

	public static Produto findById(Long codProd) throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		return (Produto) dao.executeFindById(Produto.class, codProd);
	}

	public static boolean insert(Produto obj) throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		return dao.executeInsert(obj);
	}

	public static boolean update(Produto obj) throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		return dao.executeUpdate(obj);
	}

	public static boolean delete(Produto obj) throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		return dao.executeDelete(obj);
	}

}
