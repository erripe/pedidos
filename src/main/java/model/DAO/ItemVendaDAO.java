package model.DAO;

import java.util.List;

import model.ItemVenda;

public class ItemVendaDAO extends ModelDAO {

	public ItemVendaDAO() {
	}

	@SuppressWarnings("unchecked")
	public static List<ItemVenda> findList() throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return ModelDAO.cast(dao.executeFindList("", new ItemVenda()));
	}

	@SuppressWarnings("unchecked")
	public static List<ItemVenda> findListVenda(Long codVenda) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		String sql = "";
		sql += " AND codVenda = " + codVenda;
		return ModelDAO.cast(dao.executeFindList(sql, new ItemVenda()));
	}

	@SuppressWarnings("unchecked")
	public static List<ItemVenda> findById(Long codVenda, Long codProduto) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		String sql = "";
		sql += " AND codVenda = " + codVenda;
		sql += " AND codProduto = " + codVenda;
		return ModelDAO.cast(dao.executeFindList(sql, new ItemVenda()));
	}

	public static boolean insert(ItemVenda obj) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return dao.executeInsert(obj);
	}

	public static boolean update(ItemVenda obj) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return dao.executeUpdate(obj);
	}

	public static boolean delete(ItemVenda obj) throws Exception {
		ItemVendaDAO dao = new ItemVendaDAO();
		return dao.executeDelete(obj);
	}

}
